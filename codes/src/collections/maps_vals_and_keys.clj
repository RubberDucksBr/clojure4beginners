(ns collections.maps-vals-and-keys)


; :arroz, por exemplo, é um keyword que representa um produto e 10 é o valor associado a ele.
(def estoque {:arroz 10 :feijao 20 :macarrao 30 :carne 40})

(println estoque)
(println "Os valores são" (vals estoque))
(println "As chaves são" (keys estoque))
(println "Temos" (count estoque) "itens em estoque")

(println (assoc estoque :cuscuz 15))
(println (dissoc estoque :carne))

(defn tira-um
  [valor]
  (- valor 1))

(println (update estoque :arroz tira-um))


(def pedido {
             :arroz  {:quantidade 2 :preco 10}
             :feijao {:quantidade 3 :preco 20}})

(println pedido)
(println "Arroz" pedido :arroz)
(println "Quantidade de arroz" (get pedido [:arroz :quantidade]))
(println "Feijão" (:feijao pedido))
(println "Bolo?" (:bolo pedido))
(println "Bolo?" (:bolo pedido {}))

(println (:quantidade (:arroz pedido)))

; Utilizando o get-in
(println (get-in pedido [:arroz :quantidade]))

; Utilizando threading macro
(-> pedido
    :arroz
    :quantidade
    inc
    println)