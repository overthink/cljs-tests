(defproject cljs-tests "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1835"]
                 [prismatic/dommy "0.1.1"]]
 
  :plugins [[lein-cljsbuild "0.3.2"]]

  :cljsbuild
  {:builds {:first {:source-paths ["src/first"]
                    :compiler {:optimizations :simple
                               :pretty-print true
                               :output-to "main.js"}}
            :dommy {:source-paths ["src/dommy"]
                    :compiler {:optimizations :simple
                               :pretty-print true
                               :output-to "main.js"}}}})

