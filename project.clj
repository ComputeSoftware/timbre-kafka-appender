(defproject timbre-kafka-appender "0.0.3"
  :description "timbre-kafka-appender is an appender
 for logging into kafka server"
  :url "https://github.com/ComputeSoftware/timbre-kafka-appender"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"}
  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]})
