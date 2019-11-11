(ns temp2.core)
(defn clojure-one [vars] 

  (float 
    (/  
      ( reduce + 
               ( map (fn[x] (val x))
                     ( filter (fn[k] (.endsWith (key k) "a")) vars )
               )
      )
      
      ( count
        ( filter (fn[k] (.endsWith (key k) "a")) vars)
      )
    ) 
  )
)
