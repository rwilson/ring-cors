(defproject rwilson/ring-cors "0.1.8-SNAPSHOT"
  :description "Ring middleware for Cross-Origin Resource Sharing."
  :url "http://github.com/rwilson/ring-cors"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.3.2"]]
  :deploy-repositories [["releases" :clojars]]
  :aliases {"ci" ["do" ["with-profile" "dev:dev,1.4:dev,1.5:dev,1.6:dev" "test"]]
            "build" ["do" ["clean"] ["jar"] ["test"]]
            "build-install" ["do" ["build"] ["install"]]}
  :profiles
  {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
   :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}})
