(defproject gitlab-users "0.1.0-SNAPSHOT"
  :description "Show GitLab users"
  :url "https://github.com/gaving/gitlab-users"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                [clj-http "1.0.1"]
                [sonian/carica "1.1.0"]
                [seesaw "1.4.5"]]
  :main gitlab-users.core)
