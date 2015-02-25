(defproject road "0.1.0-SNAPSHOT"
  :description "Road is a clojure web framework through packing java severlet filter."
  :url "https://github.com/zhujinxian/road"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [org.clojure/tools.macro "0.1.5"]
                 [zhu/clout "0.0.2"]
                 [hiccup "1.0.5"]]
  :aot [road.core  road.filter road.router])
