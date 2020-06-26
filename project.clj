(defproject clojure-accumulo/clojure-accumulo "0.3.0-SNAPSHOT"
  :description "Clojure bindings for Apache Accumulo"
  :url "https://github.com/charlessimpson/clojure-accumulo"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.apache.hadoop/hadoop-client "2.6.4"
                   :exclusions [ant
                                hsqldb
                                junit
                                org.mortbay.jetty
                                org.codehaus.jackson/jackson-core-asl
                                tomcat]]
                 [org.apache.zookeeper/zookeeper "3.4.6"
                   :exclusions [com.sun.jmx/jmxri
                                com.sun.jdmk/jmxtools
                                log4j
                                javax.jms/jms
                                jline/jline]]
                 [org.apache.accumulo/accumulo-core "1.9.3"
                   :exclusions [jline
                                junit
                                org.apache.httpcomponents/httpcore]]
                 [org.slf4j/slf4j-log4j12 "1.7.25"]
                 ])
