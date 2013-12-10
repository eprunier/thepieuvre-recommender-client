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
    ((symbol (str "client/" fname)) fargs)
    (stop system)))
