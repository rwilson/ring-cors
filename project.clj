(defproject rwilson/ring-cors "0.1.9"
  :description "Ring middleware for Cross-Origin Resource Sharing."
  :url "http://github.com/rwilson/ring-cors"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.4.0"]]
  :deploy-repositories [["releases" :clojars]]
  :aliases {"build" ["do" ["clean"] ["jar"] ["test"]]
            "build-install" ["do" ["build"] ["install"]]})
