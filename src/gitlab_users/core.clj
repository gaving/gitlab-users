(ns gitlab-users.core
  (:gen-class :main true)
  (:require [clj-http.client :as client])
  (:require [carica.core :refer [configurer resources]])
  (:use seesaw.core seesaw.table))

(defn get-data []
  (get (client/get (carica.core/config :url) {:accept :json :as :json}) :body))

(defn make-table []
  (table :id :table :model [
    :columns [
        { :key :id :text "Id" }
        { :key :username :text "Handle" }
        { :key :name :text "Name" }
        { :key :state :text "State" }
        { :key :avatar_url :text "Avatar" }
      ]
    :rows (get-data)]))

(defn make-frame []
  (frame :title "GitLab Users" :width 500 :height 400 :content
     (border-panel
       :center (scrollable (make-table))
       :south  (label :id :sel :text "Selection: "))))

(defn -main [& args]
  (let [f (show! (make-frame))
        t (select f [:#table])]
        (listen t :selection
          (fn [e]
            (config! (select f [:#sel])
              :text (str "Selection: "
                (value-at t (selection t))))))
        f))
