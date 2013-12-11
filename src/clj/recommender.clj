(ns recommender
  (:require [recommender.client :as client]))

(defn system
  []
  {:thrift-host "127.0.0.1"
   :thrift-port 7007})

(defn start
  "Start the system."
  [system]
  (client/connect!))

(defn stop
  "Stop the system."
  [system]
  (client/disconnect!))

(defn -main
  [& args]
  (let [system (system)
        fname (first args)
        fargs (rest args)]
    (start system)
    (println
     (condp = fname
       "get-read-articles" (apply client/get-read-articles fargs)
       "add-article" (apply client/add-article fargs)
       "get-articles" (client/get-articles (first fargs) (rest fargs))
       "read?" (apply client/read? fargs)))
    (stop system)))
