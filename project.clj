(defproject thepieuvre-recommender-client "0.1.0-SNAPSHOT"
  :description "Client for thepieuvre recommender service"
  :url "https://github.com/eprunier/thepieuvre-recommender-client"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.cli "0.2.4"]
                 [cc.qbits/alia "1.7.1"]
                 [thrift-clj "0.2.0"]
                 [org.xerial.snappy/snappy-java "1.0.4.1"]
                 [com.taoensso/carmine "2.4.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :source-paths ["dev"]}
             :thriftc {}}
  :source-paths ["src/clj"]
  :plugins [[lein-thriftc "0.1.0"]]
  :thriftc {:source-paths ["src/thrift"]}
  :main recommender)
