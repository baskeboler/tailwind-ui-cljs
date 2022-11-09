(ns tailwindui.demo.content)

(defn ^:export demo []
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

(defn ^:export demo-2 []
  [:div
   {:class "min-h-full"}
   [:header
    {:class "bg-gradient-to-r from-sky-800 to-cyan-600 pb-24"}
    [:div
     {:class "mx-auto max-w-3xl px-4 sm:px-6 lg:max-w-7xl lg:px-8"}
     [:div
      {:class
       "relative flex flex-wrap items-center justify-center lg:justify-between"}
      [:div
       {:class "absolute left-0 flex-shrink-0 py-5 lg:static"}
       [:a
        {:href "#"}
        [:span {:class "sr-only"} "Tailwind UI Asskickery"]
        [:img
         {:class "h-8 w-auto",
          :src
          "https://tailwindui.com/img/logos/mark.svg?color=cyan&shade=200",
          :alt ""}]]]
      [:div
       {:class
        "hidden lg:ml-4 lg:flex lg:items-center lg:py-5 lg:pr-0.5"}
       [:button
        {:type "button",
         :class
         "flex-shrink-0 rounded-full p-1 text-cyan-200 hover:bg-white hover:bg-opacity-10 hover:text-white focus:outline-none focus:ring-2 focus:ring-white"}
        [:span {:class "sr-only"} "View notifications"]
        [:svg
         {:class "h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d
           "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]
       [:div
        {:class "relative ml-4 flex-shrink-0"}
        [:div
         [:button
          {:type "button",
           :class
           "flex rounded-full bg-white text-sm ring-2 ring-white ring-opacity-20 focus:outline-none focus:ring-opacity-100",
           :id "user-menu-button",
           :aria-expanded "false",
           :aria-haspopup "true"}
          [:span {:class "sr-only"} "Open user menu"]
          [:img
           {:class "h-8 w-8 rounded-full",
            :src
            "https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
            :alt ""}]]]
        [:div
         {:class
          "absolute -right-2 z-10 mt-2 w-48 origin-top-right rounded-md bg-white py-1 shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none",
          :role "menu",
          :aria-orientation "vertical",
          :aria-labelledby "user-menu-button",
          :tab-index "-1"}
         [:a
          {:href "#",
           :class "block px-4 py-2 text-sm text-gray-700",
           :role "menuitem",
           :tab-index "-1",
           :id "user-menu-item-0"}
          "Your Profile"]
         [:a
          {:href "#",
           :class "block px-4 py-2 text-sm text-gray-700",
           :role "menuitem",
           :tab-index "-1",
           :id "user-menu-item-1"}
          "Settings"]
         [:a
          {:href "#",
           :class "block px-4 py-2 text-sm text-gray-700",
           :role "menuitem",
           :tab-index "-1",
           :id "user-menu-item-2"}
          "Sign out"]]]]
      [:div
       {:class
        "w-full py-5 lg:border-t lg:border-white lg:border-opacity-20"}
       [:div
        {:class "lg:grid lg:grid-cols-3 lg:items-center lg:gap-8"}
        [:div
         {:class "hidden lg:col-span-2 lg:block"}
         [:nav
          {:class "flex space-x-4"}
          [:a
           {:href "#",
            :class
            "text-white text-sm font-medium rounded-md bg-white bg-opacity-0 px-3 py-2 hover:bg-opacity-10",
            :aria-current "page"}
           "Home"]
          [:a
           {:href "#",
            :class
            "text-cyan-100 text-sm font-medium rounded-md bg-white bg-opacity-0 px-3 py-2 hover:bg-opacity-10"}
           "Profile"]
          [:a
           {:href "#",
            :class
            "text-cyan-100 text-sm font-medium rounded-md bg-white bg-opacity-0 px-3 py-2 hover:bg-opacity-10"}
           "Resources"]
          [:a
           {:href "#",
            :class
            "text-cyan-100 text-sm font-medium rounded-md bg-white bg-opacity-0 px-3 py-2 hover:bg-opacity-10"}
           "Company Directory"]
          [:a
           {:href "#",
            :class
            "text-cyan-100 text-sm font-medium rounded-md bg-white bg-opacity-0 px-3 py-2 hover:bg-opacity-10"}
           "Openings"]]]
        [:div
         {:class "px-12 lg:px-0"}
         [:div
          {:class "mx-auto w-full max-w-xs lg:max-w-md"}
          [:label {:for "search", :class "sr-only"} "Search"]
          [:div
           {:class "relative text-white focus-within:text-gray-600"}
           [:div
            {:class
             "pointer-events-none absolute inset-y-0 left-0 flex items-center pl-3"}
            [:svg
             {:class "h-5 w-5",
              :xmlns "http://www.w3.org/2000/svg",
              :viewBox "0 0 20 20",
              :fill "currentColor",
              :aria-hidden "true"}
             [:path
              {:fill-rule "evenodd",
               :d
               "M9 3.5a5.5 5.5 0 100 11 5.5 5.5 0 000-11zM2 9a7 7 0 1112.452 4.391l3.328 3.329a.75.75 0 11-1.06 1.06l-3.329-3.328A7 7 0 012 9z",
               :clip-rule "evenodd"}]]]
           [:input
            {:id "search",
             :class
             "block w-full rounded-md border border-transparent bg-white bg-opacity-20 py-2 pl-10 pr-3 leading-5 text-white placeholder-white focus:border-transparent focus:bg-opacity-100 focus:text-gray-900 focus:placeholder-gray-500 focus:outline-none focus:ring-0 sm:text-sm",
             :placeholder "Search",
             :type "search",
             :name "search"}]]]]]]
      [:div
       {:class "absolute right-0 flex-shrink-0 lg:hidden"}
       [:button
        {:type "button",
         :class
         "inline-flex items-center justify-center rounded-md bg-transparent p-2 text-cyan-200 hover:bg-white hover:bg-opacity-10 hover:text-white focus:outline-none focus:ring-2 focus:ring-white",
         :aria-expanded "false"}
        [:span {:class "sr-only"} "Open main menu"]
        [:svg
         {:class "block h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d "M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5"}]]
        [:svg
         {:class "hidden h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d "M6 18L18 6M6 6l12 12"}]]]]]]
    [:div
     {:class "lg:hidden"}
     [:div
      {:class "fixed inset-0 z-20 bg-black bg-opacity-25",
       :aria-hidden "true"}]
     [:div
      {:class
       "absolute inset-x-0 top-0 z-30 mx-auto w-full max-w-3xl origin-top transform p-2 transition"}
      [:div
       {:class
        "divide-y divide-gray-200 rounded-lg bg-white shadow-lg ring-1 ring-black ring-opacity-5"}
       [:div
        {:class "pt-3 pb-2"}
        [:div
         {:class "flex items-center justify-between px-4"}
         [:div
          [:img
           {:class "h-8 w-auto",
            :src
            "https://tailwindui.com/img/logos/mark.svg?color=cyan&shade=600",
            :alt "Your Company"}]]
         [:div
          {:class "-mr-2"}
          [:button
           {:type "button",
            :class
            "inline-flex items-center justify-center rounded-md bg-white p-2 text-gray-400 hover:bg-gray-100 hover:text-gray-500 focus:outline-none focus:ring-2 focus:ring-inset focus:ring-cyan-500"}
           [:span {:class "sr-only"} "Close menu"]
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "none",
             :viewBox "0 0 24 24",
             :stroke-width "1.5",
             :stroke "currentColor",
             :aria-hidden "true"}
            [:path
             {:stroke-linecap "round",
              :stroke-linejoin "round",
              :d "M6 18L18 6M6 6l12 12"}]]]]]
        [:div
         {:class "mt-3 space-y-1 px-2"}
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Home"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Profile"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Resources"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Company Directory"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Openings"]]]
       [:div
        {:class "pt-4 pb-2"}
        [:div
         {:class "flex items-center px-5"}
         [:div
          {:class "flex-shrink-0"}
          [:img
           {:class "h-10 w-10 rounded-full",
            :src
            "https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
            :alt ""}]]
         [:div
          {:class "ml-3 min-w-0 flex-1"}
          [:div
           {:class "truncate text-base font-medium text-gray-800"}
           "Chelsea Hagon"]
          [:div
           {:class "truncate text-sm font-medium text-gray-500"}
           "chelsea.hagon@example.com"]]
         [:button
          {:type "button",
           :class
           "ml-auto flex-shrink-0 rounded-full bg-white p-1 text-gray-400 hover:text-gray-500 focus:outline-none focus:ring-2 focus:ring-cyan-500 focus:ring-offset-2"}
          [:span {:class "sr-only"} "View notifications"]
          [:svg
           {:class "h-6 w-6",
            :xmlns "http://www.w3.org/2000/svg",
            :fill "none",
            :viewBox "0 0 24 24",
            :stroke-width "1.5",
            :stroke "currentColor",
            :aria-hidden "true"}
           [:path
            {:stroke-linecap "round",
             :stroke-linejoin "round",
             :d
             "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]]
        [:div
         {:class "mt-3 space-y-1 px-2"}
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Your Profile"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Settings"]
         [:a
          {:href "#",
           :class
           "block rounded-md px-3 py-2 text-base font-medium text-gray-900 hover:bg-gray-100 hover:text-gray-800"}
          "Sign out"]]]]]]]
   [:main
    {:class "-mt-24 pb-8"}
    [:div
     {:class "mx-auto max-w-3xl px-4 sm:px-6 lg:max-w-7xl lg:px-8"}
     [:h1 {:class "sr-only"} "Profile"]
     [:div
      {:class
       "grid grid-cols-1 items-start gap-4 lg:grid-cols-3 lg:gap-8"}
      [:div
       {:class "grid grid-cols-1 gap-4 lg:col-span-2"}
       [:section
        {:aria-labelledby "profile-overview-title"}
        [:div
         {:class "overflow-hidden rounded-lg bg-white shadow"}
         [:h2
          {:class "sr-only", :id "profile-overview-title"}
          "Profile Overview"]
         [:div
          {:class "bg-white p-6"}
          [:div
           {:class "sm:flex sm:items-center sm:justify-between"}
           [:div
            {:class "sm:flex sm:space-x-5"}
            [:div
             {:class "flex-shrink-0"}
             [:img
              {:class "mx-auto h-20 w-20 rounded-full",
               :src
               "https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
               :alt ""}]]
            [:div
             {:class "mt-4 text-center sm:mt-0 sm:pt-1 sm:text-left"}
             [:p
              {:class "text-sm font-medium text-gray-600"}
              "Welcome back,"]
             [:p
              {:class "text-xl font-bold text-gray-900 sm:text-2xl"}
              "Chelsea Hagon"]
             [:p
              {:class "text-sm font-medium text-gray-600"}
              "Human Resources Manager"]]]
           [:div
            {:class "mt-5 flex justify-center sm:mt-0"}
            [:a
             {:href "#",
              :class
              "flex items-center justify-center rounded-md border border-gray-300 bg-white px-4 py-2 text-sm font-medium text-gray-700 shadow-sm hover:bg-gray-50"}
             "View profile"]]]]
         [:div
          {:class
           "grid grid-cols-1 divide-y divide-gray-200 border-t border-gray-200 bg-gray-50 sm:grid-cols-3 sm:divide-y-0 sm:divide-x"}
          [:div
           {:class "px-6 py-5 text-center text-sm font-medium"}
           [:span {:class "text-gray-900"} "12"]
           [:span {:class "text-gray-600"} "Vacation days left"]]
          [:div
           {:class "px-6 py-5 text-center text-sm font-medium"}
           [:span {:class "text-gray-900"} "4"]
           [:span {:class "text-gray-600"} "Sick days left"]]
          [:div
           {:class "px-6 py-5 text-center text-sm font-medium"}
           [:span {:class "text-gray-900"} "2"]
           [:span {:class "text-gray-600"} "Personal days left"]]]]]
       [:section
        {:aria-labelledby "quick-links-title"}
        [:div
         {:class
          "divide-y divide-gray-200 overflow-hidden rounded-lg bg-gray-200 shadow sm:grid sm:grid-cols-2 sm:gap-px sm:divide-y-0"}
         [:h2 {:class "sr-only", :id "quick-links-title"} "Quick links"]
         [:div
          {:class
           "rounded-tl-lg rounded-tr-lg sm:rounded-tr-none relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-teal-50 text-teal-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d "M12 6v6h4.5m4.5 0a9 9 0 11-18 0 9 9 0 0118 0z"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Request time off"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]
         [:div
          {:class
           "sm:rounded-tr-lg relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-purple-50 text-purple-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d
               "M9 12.75L11.25 15 15 9.75M21 12c0 1.268-.63 2.39-1.593 3.068a3.745 3.745 0 01-1.043 3.296 3.745 3.745 0 01-3.296 1.043A3.745 3.745 0 0112 21c-1.268 0-2.39-.63-3.068-1.593a3.746 3.746 0 01-3.296-1.043 3.745 3.745 0 01-1.043-3.296A3.745 3.745 0 013 12c0-1.268.63-2.39 1.593-3.068a3.745 3.745 0 011.043-3.296 3.746 3.746 0 013.296-1.043A3.746 3.746 0 0112 3c1.268 0 2.39.63 3.068 1.593a3.746 3.746 0 013.296 1.043 3.746 3.746 0 011.043 3.296A3.745 3.745 0 0121 12z"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Benefits"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]
         [:div
          {:class
           "relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-sky-50 text-sky-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d
               "M15 19.128a9.38 9.38 0 002.625.372 9.337 9.337 0 004.121-.952 4.125 4.125 0 00-7.533-2.493M15 19.128v-.003c0-1.113-.285-2.16-.786-3.07M15 19.128v.106A12.318 12.318 0 018.624 21c-2.331 0-4.512-.645-6.374-1.766l-.001-.109a6.375 6.375 0 0111.964-3.07M12 6.375a3.375 3.375 0 11-6.75 0 3.375 3.375 0 016.75 0zm8.25 2.25a2.625 2.625 0 11-5.25 0 2.625 2.625 0 015.25 0z"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Schedule a one-on-one"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]
         [:div
          {:class
           "relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-yellow-50 text-yellow-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d
               "M2.25 18.75a60.07 60.07 0 0115.797 2.101c.727.198 1.453-.342 1.453-1.096V18.75M3.75 4.5v.75A.75.75 0 013 6h-.75m0 0v-.375c0-.621.504-1.125 1.125-1.125H20.25M2.25 6v9m18-10.5v.75c0 .414.336.75.75.75h.75m-1.5-1.5h.375c.621 0 1.125.504 1.125 1.125v9.75c0 .621-.504 1.125-1.125 1.125h-.375m1.5-1.5H21a.75.75 0 00-.75.75v.75m0 0H3.75m0 0h-.375a1.125 1.125 0 01-1.125-1.125V15m1.5 1.5v-.75A.75.75 0 003 15h-.75M15 10.5a3 3 0 11-6 0 3 3 0 016 0zm3 0h.008v.008H18V10.5zm-12 0h.008v.008H6V10.5z"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Payroll"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]
         [:div
          {:class
           "sm:rounded-bl-lg relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-rose-50 text-rose-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d
               "M8.25 9.75h4.875a2.625 2.625 0 010 5.25H12M8.25 9.75L10.5 7.5M8.25 9.75L10.5 12m9-7.243V21.75l-3.75-1.5-3.75 1.5-3.75-1.5-3.75 1.5V4.757c0-1.108.806-2.057 1.907-2.185a48.507 48.507 0 0111.186 0c1.1.128 1.907 1.077 1.907 2.185z"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Submit an expense"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]
         [:div
          {:class
           "rounded-bl-lg rounded-br-lg sm:rounded-bl-none relative group bg-white p-6 focus-within:ring-2 focus-within:ring-inset focus-within:ring-cyan-500"}
          [:div
           [:span
            {:class
             "rounded-lg inline-flex p-3 bg-indigo-50 text-indigo-700 ring-4 ring-white"}
            [:svg
             {:class "h-6 w-6",
              :xmlns "http://www.w3.org/2000/svg",
              :fill "none",
              :viewBox "0 0 24 24",
              :stroke-width "1.5",
              :stroke "currentColor",
              :aria-hidden "true"}
             [:path
              {:stroke-linecap "round",
               :stroke-linejoin "round",
               :d
               "M4.26 10.147a60.436 60.436 0 00-.491 6.347A48.627 48.627 0 0112 20.904a48.627 48.627 0 018.232-4.41 60.46 60.46 0 00-.491-6.347m-15.482 0a50.57 50.57 0 00-2.658-.813A59.905 59.905 0 0112 3.493a59.902 59.902 0 0110.399 5.84c-.896.248-1.783.52-2.658.814m-15.482 0A50.697 50.697 0 0112 13.489a50.702 50.702 0 017.74-3.342M6.75 15a.75.75 0 100-1.5.75.75 0 000 1.5zm0 0v-3.675A55.378 55.378 0 0112 8.443m-7.007 11.55A5.981 5.981 0 006.75 15.75v-1.5"}]]]]
          [:div
           {:class "mt-8"}
           [:h3
            {:class "text-lg font-medium"}
            [:a
             {:href "#", :class "focus:outline-none"}
             [:span {:class "absolute inset-0", :aria-hidden "true"}]
             "Training"]]
           [:p
            {:class "mt-2 text-sm text-gray-500"}
            "Doloribus dolores nostrum quia qui natus officia quod et dolorem. Sit repellendus qui ut at blanditiis et quo et molestiae."]]
          [:span
           {:class
            "pointer-events-none absolute top-6 right-6 text-gray-300 group-hover:text-gray-400",
            :aria-hidden "true"}
           [:svg
            {:class "h-6 w-6",
             :xmlns "http://www.w3.org/2000/svg",
             :fill "currentColor",
             :viewBox "0 0 24 24"}
            [:path
             {:d
              "M20 4h1a1 1 0 00-1-1v1zm-1 12a1 1 0 102 0h-2zM8 3a1 1 0 000 2V3zM3.293 19.293a1 1 0 101.414 1.414l-1.414-1.414zM19 4v12h2V4h-2zm1-1H8v2h12V3zm-.707.293l-16 16 1.414 1.414 16-16-1.414-1.414z"}]]]]]]]
      [:div
       {:class "grid grid-cols-1 gap-4"}
       [:section
        {:aria-labelledby "announcements-title"}
        [:div
         {:class "overflow-hidden rounded-lg bg-white shadow"}
         [:div
          {:class "p-6"}
          [:h2
           {:class "text-base font-medium text-gray-900",
            :id "announcements-title"}
           "Announcements"]
          [:div
           {:class "mt-6 flow-root"}
           [:ul
            {:role "list", :class "-my-5 divide-y divide-gray-200"}
            [:li
             {:class "py-5"}
             [:div
              {:class
               "relative focus-within:ring-2 focus-within:ring-cyan-500"}
              [:h3
               {:class "text-sm font-semibold text-gray-800"}
               [:a
                {:href "#", :class "hover:underline focus:outline-none"}
                [:span {:class "absolute inset-0", :aria-hidden "true"}]
                "Office closed on July 2nd"]]
              [:p
               {:class "mt-1 text-sm text-gray-600 line-clamp-2"}
               "Cum qui rem deleniti. Suscipit in dolor veritatis sequi aut. Vero ut earum quis deleniti. Ut a sunt eum cum ut repudiandae possimus. Nihil ex tempora neque cum consectetur dolores."]]]
            [:li
             {:class "py-5"}
             [:div
              {:class
               "relative focus-within:ring-2 focus-within:ring-cyan-500"}
              [:h3
               {:class "text-sm font-semibold text-gray-800"}
               [:a
                {:href "#", :class "hover:underline focus:outline-none"}
                [:span {:class "absolute inset-0", :aria-hidden "true"}]
                "New password policy"]]
              [:p
               {:class "mt-1 text-sm text-gray-600 line-clamp-2"}
               "Alias inventore ut autem optio voluptas et repellendus. Facere totam quaerat quam quo laudantium cumque eaque excepturi vel. Accusamus maxime ipsam reprehenderit rerum id repellendus rerum. Culpa cum vel natus. Est sit autem mollitia."]]]
            [:li
             {:class "py-5"}
             [:div
              {:class
               "relative focus-within:ring-2 focus-within:ring-cyan-500"}
              [:h3
               {:class "text-sm font-semibold text-gray-800"}
               [:a
                {:href "#", :class "hover:underline focus:outline-none"}
                [:span {:class "absolute inset-0", :aria-hidden "true"}]
                "Office closed on July 2nd"]]
              [:p
               {:class "mt-1 text-sm text-gray-600 line-clamp-2"}
               "Tenetur libero voluptatem rerum occaecati qui est molestiae exercitationem. Voluptate quisquam iure assumenda consequatur ex et recusandae. Alias consectetur voluptatibus. Accusamus a ab dicta et. Consequatur quis dignissimos voluptatem nisi."]]]]]
          [:div
           {:class "mt-6"}
           [:a
            {:href "#",
             :class
             "flex w-full items-center justify-center rounded-md border border-gray-300 bg-white px-4 py-2 text-sm font-medium text-gray-700 shadow-sm hover:bg-gray-50"}
            "View all"]]]]]
       [:section
        {:aria-labelledby "recent-hires-title"}
        [:div
         {:class "overflow-hidden rounded-lg bg-white shadow"}
         [:div
          {:class "p-6"}
          [:h2
           {:class "text-base font-medium text-gray-900",
            :id "recent-hires-title"}
           "Recent Hires"]
          [:div
           {:class "mt-6 flow-root"}
           [:ul
            {:role "list", :class "-my-5 divide-y divide-gray-200"}
            [:li
             {:class "py-4"}
             [:div
              {:class "flex items-center space-x-4"}
              [:div
               {:class "flex-shrink-0"}
               [:img
                {:class "h-8 w-8 rounded-full",
                 :src
                 "https://images.unsplash.com/photo-1519345182560-3f2917c472ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                 :alt ""}]]
              [:div
               {:class "min-w-0 flex-1"}
               [:p
                {:class "truncate text-sm font-medium text-gray-900"}
                "Leonard Krasner"]
               [:p
                {:class "truncate text-sm text-gray-500"}
                "@leonardkrasner"]]
              [:div
               [:a
                {:href "#",
                 :class
                 "inline-flex items-center rounded-full border border-gray-300 bg-white px-2.5 py-0.5 text-sm font-medium leading-5 text-gray-700 shadow-sm hover:bg-gray-50"}
                "View"]]]]
            [:li
             {:class "py-4"}
             [:div
              {:class "flex items-center space-x-4"}
              [:div
               {:class "flex-shrink-0"}
               [:img
                {:class "h-8 w-8 rounded-full",
                 :src
                 "https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                 :alt ""}]]
              [:div
               {:class "min-w-0 flex-1"}
               [:p
                {:class "truncate text-sm font-medium text-gray-900"}
                "Floyd Miles"]
               [:p
                {:class "truncate text-sm text-gray-500"}
                "@floydmiles"]]
              [:div
               [:a
                {:href "#",
                 :class
                 "inline-flex items-center rounded-full border border-gray-300 bg-white px-2.5 py-0.5 text-sm font-medium leading-5 text-gray-700 shadow-sm hover:bg-gray-50"}
                "View"]]]]
            [:li
             {:class "py-4"}
             [:div
              {:class "flex items-center space-x-4"}
              [:div
               {:class "flex-shrink-0"}
               [:img
                {:class "h-8 w-8 rounded-full",
                 :src
                 "https://images.unsplash.com/photo-1502685104226-ee32379fefbe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                 :alt ""}]]
              [:div
               {:class "min-w-0 flex-1"}
               [:p
                {:class "truncate text-sm font-medium text-gray-900"}
                "Emily Selman"]
               [:p
                {:class "truncate text-sm text-gray-500"}
                "@emilyselman"]]
              [:div
               [:a
                {:href "#",
                 :class
                 "inline-flex items-center rounded-full border border-gray-300 bg-white px-2.5 py-0.5 text-sm font-medium leading-5 text-gray-700 shadow-sm hover:bg-gray-50"}
                "View"]]]]
            [:li
             {:class "py-4"}
             [:div
              {:class "flex items-center space-x-4"}
              [:div
               {:class "flex-shrink-0"}
               [:img
                {:class "h-8 w-8 rounded-full",
                 :src
                 "https://images.unsplash.com/photo-1500917293891-ef795e70e1f6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                 :alt ""}]]
              [:div
               {:class "min-w-0 flex-1"}
               [:p
                {:class "truncate text-sm font-medium text-gray-900"}
                "Kristin Watson"]
               [:p
                {:class "truncate text-sm text-gray-500"}
                "@kristinwatson"]]
              [:div
               [:a
                {:href "#",
                 :class
                 "inline-flex items-center rounded-full border border-gray-300 bg-white px-2.5 py-0.5 text-sm font-medium leading-5 text-gray-700 shadow-sm hover:bg-gray-50"}
                "View"]]]]]]
          [:div
           {:class "mt-6"}
           [:a
            {:href "#",
             :class
             "flex w-full items-center justify-center rounded-md border border-gray-300 bg-white px-4 py-2 text-sm font-medium text-gray-700 shadow-sm hover:bg-gray-50"}
            "View all"]]]]]]]]]
   [:footer
    [:div
     {:class "mx-auto max-w-3xl px-4 sm:px-6 lg:max-w-7xl lg:px-8"}
     [:div
      {:class
       "border-t border-gray-200 py-8 text-center text-sm text-gray-500 sm:text-left"}
      [:span {:class "block sm:inline"} "&copy; 2021 Your Company, Inc."]
      [:span {:class "block sm:inline"} "All rights reserved."]]]]])

(defn demo-3 []
  [:div
   {:class "min-h-full"}
   [:header
    {:class "bg-white shadow-sm lg:static lg:overflow-y-visible"}
    [:div
     {:class "mx-auto max-w-7xl px-4 sm:px-6 lg:px-8"}
     [:div
      {:class
       "relative flex justify-between lg:gap-8 xl:grid xl:grid-cols-12"}
      [:div
       {:class
        "flex md:absolute md:inset-y-0 md:left-0 lg:static xl:col-span-2"}
       [:div
        {:class "flex flex-shrink-0 items-center"}
        [:a
         {:href "#"}
         [:img
          {:class "block h-8 w-auto",
           :src
           "https://tailwindui.com/img/logos/mark.svg?color=rose&shade=500",
           :alt "Your Company"}]]]]
      [:div
       {:class "min-w-0 flex-1 md:px-8 lg:px-0 xl:col-span-6"}
       [:div
        {:class
         "flex items-center px-6 py-4 md:mx-auto md:max-w-3xl lg:mx-0 lg:max-w-none xl:px-0"}
        [:div
         {:class "w-full"}
         [:label {:for "search", :class "sr-only"} "Search"]
         [:div
          {:class "relative"}
          [:div
           {:class
            "pointer-events-none absolute inset-y-0 left-0 flex items-center pl-3"}
           [:svg
            {:class "h-5 w-5 text-gray-400",
             :xmlns "http://www.w3.org/2000/svg",
             :viewBox "0 0 20 20",
             :fill "currentColor",
             :aria-hidden "true"}
            [:path
             {:fill-rule "evenodd",
              :d
              "M9 3.5a5.5 5.5 0 100 11 5.5 5.5 0 000-11zM2 9a7 7 0 1112.452 4.391l3.328 3.329a.75.75 0 11-1.06 1.06l-3.329-3.328A7 7 0 012 9z",
              :clip-rule "evenodd"}]]]
          [:input
           {:id "search",
            :name "search",
            :class
            "block w-full rounded-md border border-gray-300 bg-white py-2 pl-10 pr-3 text-sm placeholder-gray-500 focus:border-rose-500 focus:text-gray-900 focus:placeholder-gray-400 focus:outline-none focus:ring-1 focus:ring-rose-500 sm:text-sm",
            :placeholder "Search",
            :type "search"}]]]]]
      [:div
       {:class
        "flex items-center md:absolute md:inset-y-0 md:right-0 lg:hidden"}
       [:button
        {:type "button",
         :class
         "-mx-2 inline-flex items-center justify-center rounded-md p-2 text-gray-400 hover:bg-gray-100 hover:text-gray-500 focus:outline-none focus:ring-2 focus:ring-inset focus:ring-rose-500",
         :aria-expanded "false"}
        [:span {:class "sr-only"} "Open menu"]
        [:svg
         {:class "block h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d "M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5"}]]
        [:svg
         {:class "hidden h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d "M6 18L18 6M6 6l12 12"}]]]]
      [:div
       {:class
        "hidden lg:flex lg:items-center lg:justify-end xl:col-span-4"}
       [:a
        {:href "#",
         :class "text-sm font-medium text-gray-900 hover:underline"}
        "Go Premium"]
       [:a
        {:href "#",
         :class
         "ml-5 flex-shrink-0 rounded-full bg-white p-1 text-gray-400 hover:text-gray-500 focus:outline-none focus:ring-2 focus:ring-rose-500 focus:ring-offset-2"}
        [:span {:class "sr-only"} "View notifications"]
        [:svg
         {:class "h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d
           "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]
       [:div
        {:class "relative ml-5 flex-shrink-0"}
        [:div
         [:button
          {:type "button",
           :class
           "flex rounded-full bg-white focus:outline-none focus:ring-2 focus:ring-rose-500 focus:ring-offset-2",
           :id "user-menu-button",
           :aria-expanded "false",
           :aria-haspopup "true"}
          [:span {:class "sr-only"} "Open user menu"]
          [:img
           {:class "h-8 w-8 rounded-full",
            :src
            "https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
            :alt ""}]]]
        [:div
         {:class
          "absolute right-0 z-10 mt-2 w-48 origin-top-right rounded-md bg-white py-1 shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none",
          :role "menu",
          :aria-orientation "vertical",
          :aria-labelledby "user-menu-button",
          :tabindex "-1"}
         [:a
          {:href "#",
           :class "block py-2 px-4 text-sm text-gray-700",
           :role "menuitem",
           :tabindex "-1",
           :id "user-menu-item-0"}
          "Your Profile"]
         [:a
          {:href "#",
           :class "block py-2 px-4 text-sm text-gray-700",
           :role "menuitem",
           :tabindex "-1",
           :id "user-menu-item-1"}
          "Settings"]
         [:a
          {:href "#",
           :class "block py-2 px-4 text-sm text-gray-700",
           :role "menuitem",
           :tabindex "-1",
           :id "user-menu-item-2"}
          "Sign out"]]]
       [:a
        {:href "#",
         :class
         "ml-6 inline-flex items-center rounded-md border border-transparent bg-rose-600 px-4 py-2 text-sm font-medium text-white shadow-sm hover:bg-rose-700 focus:outline-none focus:ring-2 focus:ring-rose-500 focus:ring-offset-2"}
        "New Post"]]]]
    [:nav
     {:class "lg:hidden", :aria-label "Global"}
     [:div
      {:class "mx-auto max-w-3xl space-y-1 px-2 pt-2 pb-3 sm:px-4"}
      [:a
       {:href "#",
        :aria-current "page",
        :class
        "bg-gray-100 text-gray-900 block rounded-md py-2 px-3 text-base font-medium"}
       "Home"]
      [:a
       {:href "#",
        :class
        "hover:bg-gray-50 block rounded-md py-2 px-3 text-base font-medium"}
       "Popular"]
      [:a
       {:href "#",
        :class
        "hover:bg-gray-50 block rounded-md py-2 px-3 text-base font-medium"}
       "Communities"]
      [:a
       {:href "#",
        :class
        "hover:bg-gray-50 block rounded-md py-2 px-3 text-base font-medium"}
       "Trending"]]
     [:div
      {:class "border-t border-gray-200 pt-4"}
      [:div
       {:class "mx-auto flex max-w-3xl items-center px-4 sm:px-6"}
       [:div
        {:class "flex-shrink-0"}
        [:img
         {:class "h-10 w-10 rounded-full",
          :src
          "https://images.unsplash.com/photo-1550525811-e5869dd03032?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
          :alt ""}]]
       [:div
        {:class "ml-3"}
        [:div
         {:class "text-base font-medium text-gray-800"}
         "Chelsea Hagon"]
        [:div
         {:class "text-sm font-medium text-gray-500"}
         "chelsea.hagon@example.com"]]
       [:button
        {:type "button",
         :class
         "ml-auto flex-shrink-0 rounded-full bg-white p-1 text-gray-400 hover:text-gray-500 focus:outline-none focus:ring-2 focus:ring-rose-500 focus:ring-offset-2"}
        [:span {:class "sr-only"} "View notifications"]
        [:svg
         {:class "h-6 w-6",
          :xmlns "http://www.w3.org/2000/svg",
          :fill "none",
          :viewBox "0 0 24 24",
          :stroke-width "1.5",
          :stroke "currentColor",
          :aria-hidden "true"}
         [:path
          {:stroke-linecap "round",
           :stroke-linejoin "round",
           :d
           "M14.857 17.082a23.848 23.848 0 005.454-1.31A8.967 8.967 0 0118 9.75v-.7V9A6 6 0 006 9v.75a8.967 8.967 0 01-2.312 6.022c1.733.64 3.56 1.085 5.455 1.31m5.714 0a24.255 24.255 0 01-5.714 0m5.714 0a3 3 0 11-5.714 0"}]]]]
      [:div
       {:class "mx-auto mt-3 max-w-3xl space-y-1 px-2 sm:px-4"}
       [:a
        {:href "#",
         :class
         "block rounded-md py-2 px-3 text-base font-medium text-gray-500 hover:bg-gray-50 hover:text-gray-900"}
        "Your Profile"]
       [:a
        {:href "#",
         :class
         "block rounded-md py-2 px-3 text-base font-medium text-gray-500 hover:bg-gray-50 hover:text-gray-900"}
        "Settings"]
       [:a
        {:href "#",
         :class
         "block rounded-md py-2 px-3 text-base font-medium text-gray-500 hover:bg-gray-50 hover:text-gray-900"}
        "Sign out"]]]
     [:div
      {:class "mx-auto mt-6 max-w-3xl px-4 sm:px-6"}
      [:a
       {:href "#",
        :class
        "flex w-full items-center justify-center rounded-md border border-transparent bg-rose-600 px-4 py-2 text-base font-medium text-white shadow-sm hover:bg-rose-700"}
       "New Post"]
      [:div
       {:class "mt-6 flex justify-center"}
       [:a
        {:href "#",
         :class "text-base font-medium text-gray-900 hover:underline"}
        "Go Premium"]]]]]
   [:div
    {:class "py-10"}
    [:div
     {:class
      "mx-auto max-w-3xl sm:px-6 lg:grid lg:max-w-7xl lg:grid-cols-12 lg:gap-8 lg:px-8"}
     [:div
      {:class "hidden lg:col-span-3 lg:block xl:col-span-2"}
      [:nav
       {:aria-label "Sidebar",
        :class "sticky top-4 divide-y divide-gray-300"}
       [:div
        {:class "space-y-1 pb-8"}
        [:a
         {:href "#",
          :class
          "bg-gray-200 text-gray-900 group flex items-center px-3 py-2 text-sm font-medium rounded-md",
          :aria-current "page"}
         [:svg
          {:class "text-gray-500 flex-shrink-0 -ml-1 mr-3 h-6 w-6",
           :xmlns "http://www.w3.org/2000/svg",
           :fill "none",
           :viewBox "0 0 24 24",
           :stroke-width "1.5",
           :stroke "currentColor",
           :aria-hidden "true"}
          [:path
           {:stroke-linecap "round",
            :stroke-linejoin "round",
            :d
            "M2.25 12l8.954-8.955c.44-.439 1.152-.439 1.591 0L21.75 12M4.5 9.75v10.125c0 .621.504 1.125 1.125 1.125H9.75v-4.875c0-.621.504-1.125 1.125-1.125h2.25c.621 0 1.125.504 1.125 1.125V21h4.125c.621 0 1.125-.504 1.125-1.125V9.75M8.25 21h8.25"}]]
         [:span {:class "truncate"} "Home"]]
        [:a
         {:href "#",
          :class
          "text-gray-700 hover:bg-gray-50 group flex items-center px-3 py-2 text-sm font-medium rounded-md"}
         [:svg
          {:class
           "text-gray-400 group-hover:text-gray-500 flex-shrink-0 -ml-1 mr-3 h-6 w-6",
           :xmlns "http://www.w3.org/2000/svg",
           :fill "none",
           :viewBox "0 0 24 24",
           :stroke-width "1.5",
           :stroke "currentColor",
           :aria-hidden "true"}
          [:path
           {:stroke-linecap "round",
            :stroke-linejoin "round",
            :d
            "M15.362 5.214A8.252 8.252 0 0112 21 8.25 8.25 0 016.038 7.048 8.287 8.287 0 009 9.6a8.983 8.983 0 013.361-6.867 8.21 8.21 0 003 2.48z"}]
          [:path
           {:stroke-linecap "round",
            :stroke-linejoin "round",
            :d
            "M12 18a3.75 3.75 0 00.495-7.467 5.99 5.99 0 00-1.925 3.546 5.974 5.974 0 01-2.133-1A3.75 3.75 0 0012 18z"}]]
         [:span {:class "truncate"} "Popular"]]
        [:a
         {:href "#",
          :class
          "text-gray-700 hover:bg-gray-50 group flex items-center px-3 py-2 text-sm font-medium rounded-md"}
         [:svg
          {:class
           "text-gray-400 group-hover:text-gray-500 flex-shrink-0 -ml-1 mr-3 h-6 w-6",
           :xmlns "http://www.w3.org/2000/svg",
           :fill "none",
           :viewBox "0 0 24 24",
           :stroke-width "1.5",
           :stroke "currentColor",
           :aria-hidden "true"}
          [:path
           {:stroke-linecap "round",
            :stroke-linejoin "round",
            :d
            "M18 18.72a9.094 9.094 0 003.741-.479 3 3 0 00-4.682-2.72m.94 3.198l.001.031c0 .225-.012.447-.037.666A11.944 11.944 0 0112 21c-2.17 0-4.207-.576-5.963-1.584A6.062 6.062 0 016 18.719m12 0a5.971 5.971 0 00-.941-3.197m0 0A5.995 5.995 0 0012 12.75a5.995 5.995 0 00-5.058 2.772m0 0a3 3 0 00-4.681 2.72 8.986 8.986 0 003.74.477m.94-3.197a5.971 5.971 0 00-.94 3.197M15 6.75a3 3 0 11-6 0 3 3 0 016 0zm6 3a2.25 2.25 0 11-4.5 0 2.25 2.25 0 014.5 0zm-13.5 0a2.25 2.25 0 11-4.5 0 2.25 2.25 0 014.5 0z"}]]
         [:span {:class "truncate"} "Communities"]]
        [:a
         {:href "#",
          :class
          "text-gray-700 hover:bg-gray-50 group flex items-center px-3 py-2 text-sm font-medium rounded-md"}
         [:svg
          {:class
           "text-gray-400 group-hover:text-gray-500 flex-shrink-0 -ml-1 mr-3 h-6 w-6",
           :xmlns "http://www.w3.org/2000/svg",
           :fill "none",
           :viewBox "0 0 24 24",
           :stroke-width "1.5",
           :stroke "currentColor",
           :aria-hidden "true"}
          [:path
           {:stroke-linecap "round",
            :stroke-linejoin "round",
            :d
            "M2.25 18L9 11.25l4.306 4.307a11.95 11.95 0 015.814-5.519l2.74-1.22m0 0l-5.94-2.28m5.94 2.28l-2.28 5.941"}]]
         [:span {:class "truncate"} "Trending"]]]
       [:div
        {:class "pt-10"}
        [:p
         {:class "px-3 text-sm font-medium text-gray-500",
          :id "communities-headline"}
         "Communities"]
        [:div
         {:class "mt-3 space-y-2",
          :aria-labelledby "communities-headline"}
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Movies"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Food"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Sports"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Animals"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Science"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Dinosaurs"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Talents"]]
         [:a
          {:href "#",
           :class
           "group flex items-center rounded-md px-3 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 hover:text-gray-900"}
          [:span {:class "truncate"} "Gaming"]]]]]]
     [:main
      {:class "lg:col-span-9 xl:col-span-6"}
      [:div
       {:class "px-4 sm:px-0"}
       [:div
        {:class "sm:hidden"}
        [:label {:for "question-tabs", :class "sr-only"} "Select a tab"]
        [:select
         {:id "question-tabs",
          :class
          "block w-full rounded-md border-gray-300 text-base font-medium text-gray-900 shadow-sm focus:border-rose-500 focus:ring-rose-500"}
         [:option {:selected true} "Recent"]
         [:option "Most Liked"]
         [:option "Most Answers"]]]
       [:div
        {:class "hidden sm:block"}
        [:nav
         {:class
          "isolate flex divide-x divide-gray-200 rounded-lg shadow",
          :aria-label "Tabs"}
         [:a
          {:href "#",
           :aria-current "page",
           :class
           "text-gray-900 rounded-l-lg group relative min-w-0 flex-1 overflow-hidden bg-white py-4 px-6 text-sm font-medium text-center hover:bg-gray-50 focus:z-10"}
          [:span "Recent"]
          [:span
           {:aria-hidden "true",
            :class "bg-rose-500 absolute inset-x-0 bottom-0 h-0.5"}]]
         [:a
          {:href "#",
           :class
           "text-gray-500 hover:text-gray-700 group relative min-w-0 flex-1 overflow-hidden bg-white py-4 px-6 text-sm font-medium text-center hover:bg-gray-50 focus:z-10"}
          [:span "Most Liked"]
          [:span
           {:aria-hidden "true",
            :class "bg-transparent absolute inset-x-0 bottom-0 h-0.5"}]]
         [:a
          {:href "#",
           :class
           "text-gray-500 hover:text-gray-700 rounded-r-lg group relative min-w-0 flex-1 overflow-hidden bg-white py-4 px-6 text-sm font-medium text-center hover:bg-gray-50 focus:z-10"}
          [:span "Most Answers"]
          [:span
           {:aria-hidden "true",
            :class
            "bg-transparent absolute inset-x-0 bottom-0 h-0.5"}]]]]]
      [:div
       {:class "mt-4"}
       [:h1 {:class "sr-only"} "Recent questions"]
       [:ul
        {:role "list", :class "space-y-4"}
        [:li
         {:class "bg-white px-4 py-6 shadow sm:rounded-lg sm:p-6"}
         [:article
          {:aria-labelledby "question-title-81614"}
          [:div
           [:div
            {:class "flex space-x-3"}
            [:div
             {:class "flex-shrink-0"}
             [:img
              {:class "h-10 w-10 rounded-full",
               :src
               "https://images.unsplash.com/photo-1506794778202-cad84cf45f1d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
               :alt ""}]]
            [:div
             {:class "min-w-0 flex-1"}
             [:p
              {:class "text-sm font-medium text-gray-900"}
              [:a {:href "#", :class "hover:underline"} "Dries Vincent"]]
             [:p
              {:class "text-sm text-gray-500"}
              [:a
               {:href "#", :class "hover:underline"}
               [:time
                {:datetime "2020-12-09T11:43:00"}
                "December 9 at 11:43 AM"]]]]
            [:div
             {:class "flex flex-shrink-0 self-center"}
             [:div
              {:class "relative inline-block text-left"}
              [:div
               [:button
                {:type "button",
                 :class
                 "-m-2 flex items-center rounded-full p-2 text-gray-400 hover:text-gray-600",
                 :id "options-menu-0-button",
                 :aria-expanded "false",
                 :aria-haspopup "true"}
                [:span {:class "sr-only"} "Open options"]
                [:svg
                 {:class "h-5 w-5",
                  :xmlns "http://www.w3.org/2000/svg",
                  :viewBox "0 0 20 20",
                  :fill "currentColor",
                  :aria-hidden "true"}
                 [:path
                  {:d
                   "M10 3a1.5 1.5 0 110 3 1.5 1.5 0 010-3zM10 8.5a1.5 1.5 0 110 3 1.5 1.5 0 010-3zM11.5 15.5a1.5 1.5 0 10-3 0 1.5 1.5 0 003 0z"}]]]]
              [:div
               {:class
                "absolute right-0 z-10 mt-2 w-56 origin-top-right rounded-md bg-white shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none",
                :role "menu",
                :aria-orientation "vertical",
                :aria-labelledby "options-menu-0-button",
                :tabindex "-1"}
               [:div
                {:class "py-1", :role "none"}
                [:a
                 {:href "#",
                  :class "text-gray-700 flex px-4 py-2 text-sm",
                  :role "menuitem",
                  :tabindex "-1",
                  :id "options-menu-0-item-0"}
                 [:svg
                  {:class "mr-3 h-5 w-5 text-gray-400",
                   :xmlns "http://www.w3.org/2000/svg",
                   :viewBox "0 0 20 20",
                   :fill "currentColor",
                   :aria-hidden "true"}
                  [:path
                   {:fill-rule "evenodd",
                    :d
                    "M10.868 2.884c-.321-.772-1.415-.772-1.736 0l-1.83 4.401-4.753.381c-.833.067-1.171 1.107-.536 1.651l3.62 3.102-1.106 4.637c-.194.813.691 1.456 1.405 1.02L10 15.591l4.069 2.485c.713.436 1.598-.207 1.404-1.02l-1.106-4.637 3.62-3.102c.635-.544.297-1.584-.536-1.65l-4.752-.382-1.831-4.401z",
                    :clip-rule "evenodd"}]]
                 [:span "Add to favorites"]]
                [:a
                 {:href "#",
                  :class "text-gray-700 flex px-4 py-2 text-sm",
                  :role "menuitem",
                  :tabindex "-1",
                  :id "options-menu-0-item-1"}
                 [:svg
                  {:class "mr-3 h-5 w-5 text-gray-400",
                   :xmlns "http://www.w3.org/2000/svg",
                   :viewBox "0 0 20 20",
                   :fill "currentColor",
                   :aria-hidden "true"}
                  [:path
                   {:fill-rule "evenodd",
                    :d
                    "M6.28 5.22a.75.75 0 010 1.06L2.56 10l3.72 3.72a.75.75 0 01-1.06 1.06L.97 10.53a.75.75 0 010-1.06l4.25-4.25a.75.75 0 011.06 0zm7.44 0a.75.75 0 011.06 0l4.25 4.25a.75.75 0 010 1.06l-4.25 4.25a.75.75 0 01-1.06-1.06L17.44 10l-3.72-3.72a.75.75 0 010-1.06zM11.377 2.011a.75.75 0 01.612.867l-2.5 14.5a.75.75 0 01-1.478-.255l2.5-14.5a.75.75 0 01.866-.612z",
                    :clip-rule "evenodd"}]]
                 [:span "Embed"]]
                [:a
                 {:href "#",
                  :class "text-gray-700 flex px-4 py-2 text-sm",
                  :role "menuitem",
                  :tabindex "-1",
                  :id "options-menu-0-item-2"}
                 [:svg
                  {:class "mr-3 h-5 w-5 text-gray-400",
                   :xmlns "http://www.w3.org/2000/svg",
                   :viewBox "0 0 20 20",
                   :fill "currentColor",
                   :aria-hidden "true"}
                  [:path
                   {:d
                    "M3.5 2.75a.75.75 0 00-1.5 0v14.5a.75.75 0 001.5 0v-4.392l1.657-.348a6.449 6.449 0 014.271.572 7.948 7.948 0 005.965.524l2.078-.64A.75.75 0 0018 12.25v-8.5a.75.75 0 00-.904-.734l-2.38.501a7.25 7.25 0 01-4.186-.363l-.502-.2a8.75 8.75 0 00-5.053-.439l-1.475.31V2.75z"}]]
                 [:span "Report content"]]]]]]]
           [:h2
            {:id "question-title-81614",
             :class "mt-4 text-base font-medium text-gray-900"}
            "What would you have done differently if you ran Jurassic Park?"]]
          [:div
           {:class "mt-2 space-y-4 text-sm text-gray-700"}
           [:p
            "Jurassic Park was an incredible idea and a magnificent feat of engineering, but poor protocols and a disregard for human safety killed what could have otherwise been one of the best businesses of our generation."]
           [:p
            "Ultimately, I think that if you wanted to run the park successfully and keep visitors safe, the most important thing to prioritize would be&hellip;"]]
          [:div
           {:class "mt-6 flex justify-between space-x-8"}
           [:div
            {:class "flex space-x-6"}
            [:span
             {:class "inline-flex items-center text-sm"}
             [:button
              {:type "button",
               :class
               "inline-flex space-x-2 text-gray-400 hover:text-gray-500"}
              [:svg
               {:class "h-5 w-5",
                :xmlns "http://www.w3.org/2000/svg",
                :viewBox "0 0 20 20",
                :fill "currentColor",
                :aria-hidden "true"}
               [:path
                {:d
                 "M1 8.25a1.25 1.25 0 112.5 0v7.5a1.25 1.25 0 11-2.5 0v-7.5zM11 3V1.7c0-.268.14-.526.395-.607A2 2 0 0114 3c0 .995-.182 1.948-.514 2.826-.204.54.166 1.174.744 1.174h2.52c1.243 0 2.261 1.01 2.146 2.247a23.864 23.864 0 01-1.341 5.974C17.153 16.323 16.072 17 14.9 17h-3.192a3 3 0 01-1.341-.317l-2.734-1.366A3 3 0 006.292 15H5V8h.963c.685 0 1.258-.483 1.612-1.068a4.011 4.011 0 012.166-1.73c.432-.143.853-.386 1.011-.814.16-.432.248-.9.248-1.388z"}]]
              [:span {:class "font-medium text-gray-900"} "29"]
              [:span {:class "sr-only"} "likes"]]]
            [:span
             {:class "inline-flex items-center text-sm"}
             [:button
              {:type "button",
               :class
               "inline-flex space-x-2 text-gray-400 hover:text-gray-500"}
              [:svg
               {:class "h-5 w-5",
                :xmlns "http://www.w3.org/2000/svg",
                :viewBox "0 0 20 20",
                :fill "currentColor",
                :aria-hidden "true"}
               [:path
                {:fill-rule "evenodd",
                 :d
                 "M10 2c-2.236 0-4.43.18-6.57.524C1.993 2.755 1 4.014 1 5.426v5.148c0 1.413.993 2.67 2.43 2.902.848.137 1.705.248 2.57.331v3.443a.75.75 0 001.28.53l3.58-3.579a.78.78 0 01.527-.224 41.202 41.202 0 005.183-.5c1.437-.232 2.43-1.49 2.43-2.903V5.426c0-1.413-.993-2.67-2.43-2.902A41.289 41.289 0 0010 2zm0 7a1 1 0 100-2 1 1 0 000 2zM8 8a1 1 0 11-2 0 1 1 0 012 0zm5 1a1 1 0 100-2 1 1 0 000 2z",
                 :clip-rule "evenodd"}]]
              [:span {:class "font-medium text-gray-900"} "11"]
              [:span {:class "sr-only"} "replies"]]]
            [:span
             {:class "inline-flex items-center text-sm"}
             [:button
              {:type "button",
               :class
               "inline-flex space-x-2 text-gray-400 hover:text-gray-500"}
              [:svg
               {:class "h-5 w-5",
                :xmlns "http://www.w3.org/2000/svg",
                :viewBox "0 0 20 20",
                :fill "currentColor",
                :aria-hidden "true"}
               [:path {:d "M10 12.5a2.5 2.5 0 100-5 2.5 2.5 0 000 5z"}]
               [:path
                {:fill-rule "evenodd",
                 :d
                 "M.664 10.59a1.651 1.651 0 010-1.186A10.004 10.004 0 0110 3c4.257 0 7.893 2.66 9.336 6.41.147.381.146.804 0 1.186A10.004 10.004 0 0110 17c-4.257 0-7.893-2.66-9.336-6.41zM14 10a4 4 0 11-8 0 4 4 0 018 0z",
                 :clip-rule "evenodd"}]]
              [:span {:class "font-medium text-gray-900"} "2.7k"]
              [:span {:class "sr-only"} "views"]]]]
           [:div
            {:class "flex text-sm"}
            [:span
             {:class "inline-flex items-center text-sm"}
             [:button
              {:type "button",
               :class
               "inline-flex space-x-2 text-gray-400 hover:text-gray-500"}
              [:svg
               {:class "h-5 w-5",
                :xmlns "http://www.w3.org/2000/svg",
                :viewBox "0 0 20 20",
                :fill "currentColor",
                :aria-hidden "true"}
               [:path
                {:d
                 "M13 4.5a2.5 2.5 0 11.702 1.737L6.97 9.604a2.518 2.518 0 010 .792l6.733 3.367a2.5 2.5 0 11-.671 1.341l-6.733-3.367a2.5 2.5 0 110-3.475l6.733-3.366A2.52 2.52 0 0113 4.5z"}]]
              [:span
               {:class "font-medium text-gray-900"}
               "Share"]]]]]]]]]]
     [:aside
      {:class "hidden xl:col-span-4 xl:block"}
      [:div
       {:class "sticky top-4 space-y-4"}
       [:section
        {:aria-labelledby "who-to-follow-heading"}
        [:div
         {:class "rounded-lg bg-white shadow"}
         [:div
          {:class "p-6"}
          [:h2
           {:id "who-to-follow-heading",
            :class "text-base font-medium text-gray-900"}
           "Who to follow"]
          [:div
           {:class "mt-6 flow-root"}
           [:ul
            {:role "list", :class "-my-4 divide-y divide-gray-200"}
            [:li
             {:class "flex items-center space-x-3 py-4"}
             [:div
              {:class "flex-shrink-0"}
              [:img
               {:class "h-8 w-8 rounded-full",
                :src
                "https://images.unsplash.com/photo-1519345182560-3f2917c472ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                :alt ""}]]
             [:div
              {:class "min-w-0 flex-1"}
              [:p
               {:class "text-sm font-medium text-gray-900"}
               [:a {:href "#"} "Leonard Krasner"]]
              [:p
               {:class "text-sm text-gray-500"}
               [:a {:href "#"} "@leonardkrasner"]]]
             [:div
              {:class "flex-shrink-0"}
              [:button
               {:type "button",
                :class
                "inline-flex items-center rounded-full bg-rose-50 px-3 py-0.5 text-sm font-medium text-rose-700 hover:bg-rose-100"}
               [:svg
                {:class "-ml-1 mr-0.5 h-5 w-5 text-rose-400",
                 :xmlns "http://www.w3.org/2000/svg",
                 :viewBox "0 0 20 20",
                 :fill "currentColor",
                 :aria-hidden "true"}
                [:path
                 {:d
                  "M10.75 4.75a.75.75 0 00-1.5 0v4.5h-4.5a.75.75 0 000 1.5h4.5v4.5a.75.75 0 001.5 0v-4.5h4.5a.75.75 0 000-1.5h-4.5v-4.5z"}]]
               [:span "Follow"]]]]]]
          [:div
           {:class "mt-6"}
           [:a
            {:href "#",
             :class
             "block w-full rounded-md border border-gray-300 bg-white px-4 py-2 text-center text-sm font-medium text-gray-700 shadow-sm hover:bg-gray-50"}
            "View all"]]]]]
       [:section
        {:aria-labelledby "trending-heading"}
        [:div
         {:class "rounded-lg bg-white shadow"}
         [:div
          {:class "p-6"}
          [:h2
           {:id "trending-heading",
            :class "text-base font-medium text-gray-900"}
           "Trending"]
          [:div
           {:class "mt-6 flow-root"}
           [:ul
            {:role "list", :class "-my-4 divide-y divide-gray-200"}
            [:li
             {:class "flex space-x-3 py-4"}
             [:div
              {:class "flex-shrink-0"}
              [:img
               {:class "h-8 w-8 rounded-full",
                :src
                "https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=facearea&facepad=2&w=256&h=256&q=80",
                :alt "Floyd Miles"}]]
             [:div
              {:class "min-w-0 flex-1"}
              [:p
               {:class "text-sm text-gray-800"}
               "What books do you have on your bookshelf just to look smarter than you actually are?"]
              [:div
               {:class "mt-2 flex"}
               [:span
                {:class "inline-flex items-center text-sm"}
                [:button
                 {:type "button",
                  :class
                  "inline-flex space-x-2 text-gray-400 hover:text-gray-500"}
                 [:svg
                  {:class "h-5 w-5",
                   :xmlns "http://www.w3.org/2000/svg",
                   :viewBox "0 0 20 20",
                   :fill "currentColor",
                   :aria-hidden "true"}
                  [:path
                   {:fill-rule "evenodd",
                    :d
                    "M10 2c-2.236 0-4.43.18-6.57.524C1.993 2.755 1 4.014 1 5.426v5.148c0 1.413.993 2.67 2.43 2.902.848.137 1.705.248 2.57.331v3.443a.75.75 0 001.28.53l3.58-3.579a.78.78 0 01.527-.224 41.202 41.202 0 005.183-.5c1.437-.232 2.43-1.49 2.43-2.903V5.426c0-1.413-.993-2.67-2.43-2.902A41.289 41.289 0 0010 2zm0 7a1 1 0 100-2 1 1 0 000 2zM8 8a1 1 0 11-2 0 1 1 0 012 0zm5 1a1 1 0 100-2 1 1 0 000 2z",
                    :clip-rule "evenodd"}]]
                 [:span
                  {:class "font-medium text-gray-900"}
                  "291"]]]]]]]]
          [:div
           {:class "mt-6"}
           [:a
            {:href "#",
             :class
             "block w-full rounded-md border border-gray-300 bg-white px-4 py-2 text-center text-sm font-medium text-gray-700 shadow-sm hover:bg-gray-50"}
            "View all"]]]]]]]]]])