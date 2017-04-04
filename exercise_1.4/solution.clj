;; Describe the behavior of the following:

(defn a-plus-abs-b
  [a b]
  ((if (> b 0) + -) a b))

;; The if returns a operator + if b is greater than 0 or - is it is not.
;; This operator is then applied to a and b.
