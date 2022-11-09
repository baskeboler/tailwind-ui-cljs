(ns tailwindui.components.toggle)

(defn ^:export toggle 
  [{:keys [enabled? on-click]}]
  (let [translate-class (if enabled? "translate-x-5 " "translate-x-0 ")] 
    [:button
     {:type "button",
      :class
      "bg-gray-200 relative inline-flex h-6 w-11 flex-shrink-0 cursor-pointer rounded-full border-2 border-transparent transition-colors duration-200 ease-in-out focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:ring-offset-2",
      :role "switch",
      :on-click on-click
      :aria-checked (if enabled? "true" "false")}
     [:span {:class "sr-only"} "Use setting"]
     [:span
      {:aria-hidden "true",
       :class
       (str translate-class "pointer-events-none inline-block h-5 w-5 transform rounded-full bg-white shadow ring-0 transition duration-200 ease-in-out")}]]))
