# timbre-kafka-appender

A timbre appender designed to send log to kafka.

## Usage

basic demo for appender usage
```
(merge-config!
 {:appenders {:franzy (franzy-appender
                       {:topic "test-clj-topic"
                        :kafka-config
                        {:bootstrap.servers
                         ["172.0.1.12:9092"
                          "172.0.1.13:9092"
                          "172.0.1.14:9092"]}})}})
```

more complicated one:

```
(require
   '[franzy.serialization.serializers :as serializers])
(merge-config!
 {:appenders {:franzy (franzy-appender
                       {:topic "test-clj-topic"
                        :entry-fn
                         #(:msg %)
                        :kafka-config
                        {:bootstrap.servers
                         ["172.0.1.12:9092"
                          "172.0.1.13:9092"
                          "172.0.1.14:9092"]}
                        :key-serializer
                        serializers/keyword-serializer
                        :value-serializer
                        serializers/string-serializer
                        })}})
```

## the MIT License

Copyright © 2016 Richard Wong

Distributed under the MIT License.
