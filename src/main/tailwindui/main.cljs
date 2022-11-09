(ns tailwindui.main
  (:require [reagent.core :refer [atom]]
            [reagent.dom :as rdom]
            [tailwindui.components.toggle :as t]
            [tailwindui.demo.content :refer [demo]]))



(defn app []
  (let [toggled? (atom false)]
    (fn [] 
      [:div 
       [:h1.text-5xl.mx-auto.text-center.my-4 "hello worlssd"]
       [:p "some text"
        [t/toggle
         {:enabled? @toggled? 
          :on-click #(swap! toggled? not)}]]
       [demo]])))

(defn ^:dev/after-load ^:export init [] 
  (println "hello world")
  (rdom/render [app] (. js/document (getElementById "app"))))