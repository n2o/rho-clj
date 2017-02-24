(set-env!
 :source-paths #{"src" "content"}
 :dependencies '[[perun "0.4.2-SNAPSHOT" :scope "test"]
                 [pandeiro/boot-http "0.7.5"]
                 [hiccup "1.0.5"]])

(require '[io.perun :refer :all]
         '[pandeiro.boot-http :refer [serve]])
