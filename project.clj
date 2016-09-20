(defproject cljds/ch1 "0.1.0"
  :description "Example code for the book Clojure for Data Science"
  :url "https://github.com/clojuredatascience/ch1-statistics"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [incanter/incanter "1.9.1"
                 :exclusions [org.jblas/jblas]]
                 [org.jblas/jblas "1.2.4-SNAPSHOT"]]
  :resource-paths ["data"]
  :aot [cljds.ch1.core]
  :main cljds.ch1.core
  :repl-options {:init-ns cljds.ch1.examples}
  :profiles {:dev {:dependencies [[org.clojure/tools.cli "0.3.1"]]}}
  
  :jvm-opts ["-Xmx4G"])
