(defproject rho "0.1.0"
  :description "Static website for renate-horsch.de"
  :url "http://renate-horsch.de"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-devel "1.5.1"]
                 [compojure "1.5.2"]
                 [ring-server "0.4.0"]
                 [cryogen-markdown "0.1.6"]
                 [cryogen-core "0.1.52"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-ancient "0.6.10"]]
  :main rho.core
  :source-paths ["src"]
  :ring {:init rho.server/init
         :handler rho.server/handler
         :auto-refresh? true})
