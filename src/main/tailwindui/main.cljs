(ns tailwindui.main
  (:require [reagent.core :refer [atom]]
            [reagent.dom :as rdom]
            ;; ["react" :as react :refer [Fragment]]
            ;; [tailwindui.components.toggle :as t]
            [tailwindui.demo.content :refer [demo demo-2 demo-3]]
            ["@headlessui/react" :as hui]))

#_(defn question-icon []
  [:svg
   {:xmlns "http://www.w3.org/2000/svg",
    :viewBox "0 0 24 24",
    :fill "currentColor",
    :class "w-6 h-6"}
   [:path
    {:fill-rule "evenodd",
     :d
     "M2.25 12c0-5.385 4.365-9.75 9.75-9.75s9.75 4.365 9.75 9.75-4.365 9.75-9.75 9.75S2.25 17.385 2.25 12zm11.378-3.917c-.89-.777-2.366-.777-3.255 0a.75.75 0 01-.988-1.129c1.454-1.272 3.776-1.272 5.23 0 1.513 1.324 1.513 3.518 0 4.842a3.75 3.75 0 01-.837.552c-.676.328-1.028.774-1.028 1.152v.75a.75.75 0 01-1.5 0v-.75c0-1.279 1.06-2.107 1.875-2.502.182-.088.351-.199.503-.331.83-.727.83-1.857 0-2.584zM12 18a.75.75 0 100-1.5.75.75 0 000 1.5z",
     :clip-rule "evenodd"}]])
(defn app []
  (let [toggled? (atom false)]
    (fn [] 
      #_[:div 
       [:h1.text-5xl.mx-auto.text-center.my-4
        [:span {:class "text-black hover:text-red-500"}
         "hello worlssd" [question-icon]]]
       [:p "some text"
        [t/toggle
         {:enabled? @toggled? 
          :on-click #(swap! toggled? not)}]]]
      [demo-3])))

(defn ^:dev/after-load ^:export init [] 
  (println "hello world")
  #_(rdom/render [app] (. js/document (getElementById "app")))
  (rdom/render [app] (.-body js/document)))