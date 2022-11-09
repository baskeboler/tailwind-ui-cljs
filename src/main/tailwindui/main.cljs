(ns tailwindui.main
  (:require [tailwindui.components.popover]
            [tailwindui.components.toggle]
            [reagent.dom :as rdom]
            [reagent.core :refer [atom]]))


(defn demo [] 
  [:div
   {:class "bg-white"}
   [:div
    {:class "mx-auto max-w-7xl py-24 px-4 sm:px-6 lg:px-8"}
    [:div
     {:class "sm:align-center sm:flex sm:flex-col"}
     [:h1
      {:class
       "text-5xl font-bold tracking-tight text-gray-900 sm:text-center"}
      "Pricing Plans"]
     [:p
      {:class "mt-5 text-xl text-gray-500 sm:text-center"}
      "Start building for free, then add a site plan to go live. Account plans unlock additional features."]
     [:div
      {:class
       "relative mt-6 flex self-center rounded-lg bg-gray-100 p-0.5 sm:mt-8"}
      [:button
       {:type "button",
        :class
        "relative w-1/2 whitespace-nowrap rounded-md border-gray-200 bg-white py-2 text-sm font-medium text-gray-900 shadow-sm focus:z-10 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:w-auto sm:px-8"}
       "Monthly billing"]
      [:button
       {:type "button",
        :class
        "relative ml-0.5 w-1/2 whitespace-nowrap rounded-md border border-transparent py-2 text-sm font-medium text-gray-700 focus:z-10 focus:outline-none focus:ring-2 focus:ring-indigo-500 sm:w-auto sm:px-8"}
       "Yearly billing"]]]
    [:div
     {:class
      "mt-12 space-y-4 sm:mt-16 sm:grid sm:grid-cols-2 sm:gap-6 sm:space-y-0 lg:mx-auto lg:max-w-4xl xl:mx-0 xl:max-w-none xl:grid-cols-4"}
     [:div
      {:class
       "divide-y divide-gray-200 rounded-lg border border-gray-200 shadow-sm"}
      [:div
       {:class "p-6"}
       [:h2
        {:class "text-lg font-medium leading-6 text-gray-900"}
        "Hobby"]
       [:p
        {:class "mt-4 text-sm text-gray-500"}
        "All the basics for starting a new business"]
       [:p
        {:class "mt-8"}
        [:span
         {:class "text-4xl font-bold tracking-tight text-gray-900"}
         "$12"]
        [:span {:class "text-base font-medium text-gray-500"} "/mo"]]
       [:a
        {:href "#",
         :class
         "mt-8 block w-full rounded-md border border-gray-800 bg-gray-800 py-2 text-center text-sm font-semibold text-white hover:bg-gray-900"}
        "Buy Hobby"]]
      [:div
       {:class "px-6 pt-6 pb-8"}
       [:h3
        {:class "text-sm font-medium text-gray-900"}
        "What's included"]
       [:ul
        {:role "list", :class "mt-6 space-y-4"}
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Potenti felis, in cras at at ligula nunc."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Orci neque eget pellentesque."]]]]]
     [:div
      {:class
       "divide-y divide-gray-200 rounded-lg border border-gray-200 shadow-sm"}
      [:div
       {:class "p-6"}
       [:h2
        {:class "text-lg font-medium leading-6 text-gray-900"}
        "Freelancer"]
       [:p
        {:class "mt-4 text-sm text-gray-500"}
        "All the basics for starting a new business"]
       [:p
        {:class "mt-8"}
        [:span
         {:class "text-4xl font-bold tracking-tight text-gray-900"}
         "$24"]
        [:span {:class "text-base font-medium text-gray-500"} "/mo"]]
       [:a
        {:href "#",
         :class
         "mt-8 block w-full rounded-md border border-gray-800 bg-gray-800 py-2 text-center text-sm font-semibold text-white hover:bg-gray-900"}
        "Buy Freelancer"]]
      [:div
       {:class "px-6 pt-6 pb-8"}
       [:h3
        {:class "text-sm font-medium text-gray-900"}
        "What's included"]
       [:ul
        {:role "list", :class "mt-6 space-y-4"}
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Potenti felis, in cras at at ligula nunc."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Orci neque eget pellentesque."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Donec mauris sit in eu tincidunt etiam."]]]]]
     [:div
      {:class
       "divide-y divide-gray-200 rounded-lg border border-gray-200 shadow-sm"}
      [:div
       {:class "p-6"}
       [:h2
        {:class "text-lg font-medium leading-6 text-gray-900"}
        "Startup"]
       [:p
        {:class "mt-4 text-sm text-gray-500"}
        "All the basics for starting a new business"]
       [:p
        {:class "mt-8"}
        [:span
         {:class "text-4xl font-bold tracking-tight text-gray-900"}
         "$32"]
        [:span {:class "text-base font-medium text-gray-500"} "/mo"]]
       [:a
        {:href "#",
         :class
         "mt-8 block w-full rounded-md border border-gray-800 bg-gray-800 py-2 text-center text-sm font-semibold text-white hover:bg-gray-900"}
        "Buy Startup"]]
      [:div
       {:class "px-6 pt-6 pb-8"}
       [:h3
        {:class "text-sm font-medium text-gray-900"}
        "What's included"]
       [:ul
        {:role "list", :class "mt-6 space-y-4"}
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Potenti felis, in cras at at ligula nunc."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Orci neque eget pellentesque."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Donec mauris sit in eu tincidunt etiam."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Faucibus volutpat magna."]]]]]
     [:div
      {:class
       "divide-y divide-gray-200 rounded-lg border border-gray-200 shadow-sm"}
      [:div
       {:class "p-6"}
       [:h2
        {:class "text-lg font-medium leading-6 text-gray-900"}
        "Enterprise"]
       [:p
        {:class "mt-4 text-sm text-gray-500"}
        "All the basics for starting a new business"]
       [:p
        {:class "mt-8"}
        [:span
         {:class "text-4xl font-bold tracking-tight text-gray-900"}
         "$48"]
        [:span {:class "text-base font-medium text-gray-500"} "/mo"]]
       [:a
        {:href "#",
         :class
         "mt-8 block w-full rounded-md border border-gray-800 bg-gray-800 py-2 text-center text-sm font-semibold text-white hover:bg-gray-900"}
        "Buy Enterprise"]]
      [:div
       {:class "px-6 pt-6 pb-8"}
       [:h3
        {:class "text-sm font-medium text-gray-900"}
        "What's included"]
       [:ul
        {:role "list", :class "mt-6 space-y-4"}
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Potenti felis, in cras at at ligula nunc."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Orci neque eget pellentesque."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Donec mauris sit in eu tincidunt etiam."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Faucibus volutpat magna."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Id sed tellus in varius quisque."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Risus egestas faucibus."]]
        [:li
         {:class "flex space-x-3"}
         [:svg
          {:class "h-5 w-5 flex-shrink-0 text-green-500",
           :xmlns "http://www.w3.org/2000/svg",
           :viewBox "0 0 20 20",
           :fill "currentColor",
           :aria-hidden "true"}
          [:path
           {:fill-rule "evenodd",
            :d
            "M16.704 4.153a.75.75 0 01.143 1.052l-8 10.5a.75.75 0 01-1.127.075l-4.5-4.5a.75.75 0 011.06-1.06l3.894 3.893 7.48-9.817a.75.75 0 011.05-.143z",
            :clip-rule "evenodd"}]]
         [:span
          {:class "text-sm text-gray-500"}
          "Risus cursus ullamcorper."]]]]]]]])

(defn app []
  (let [toggled? (atom false)]
    (fn [] 
      [:div 
       [:h1 "hello world"]
       [tailwindui.components.toggle/toggle {:enabled? @toggled?
                                             :on-click #(swap! toggled? not)}]
       [demo]])))

(defn init [] 
  (println "hello world")
  (rdom/render [app] (.. js/document (getElementById "app"))))