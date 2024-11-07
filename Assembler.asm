SUMA


    movq    %rsp, %rbp      ; Establece el puntero de base al valor del puntero de pila
    movl    $1, -8(%rbp)    ; Asigna el valor 1 a la variable en -8(%rbp)
    movl    $2, -12(%rbp)   ; Asigna el valor 2 a la variable en -12(%rbp)
    movl    -8(%rbp), %eax  ; Mueve el valor de -8(%rbp) al registro %eax
    addl    -12(%rbp), %eax ; Suma el valor de -12(%rbp) al registro %eax


ASIGNACION

    pushq   %rbp            ; Guarda el valor del puntero de base
    movq    %rsp, %rbp      ; Establece el puntero de base al valor del puntero de pila
    movl    $1, -16(%rbp)   ; Asigna el valor 1 a la variable en -16(%rbp)
    movl    $0, %eax        ; Asigna el valor 0 al registro %eax


MULT

    pushq   %rbp            ; Guarda el valor del puntero de base
    movq    %rsp, %rbp      ; Establece el puntero de base al valor del puntero de pila
    movl    $1, -32(%rbp)   ; Asigna el valor 1 a la variable en -32(%rbp)
    movl    $3, -8(%rbp)    ; Asigna el valor 3 a la variable en -8(%rbp)
    movl    -32(%rbp), %eax ; Mueve el valor de -32(%rbp) al registro %eax
    imull   -8(%rbp), %eax  ; Multiplica el valor de -8(%rbp) con %eax
    popq    %rbp            ; Restaura el valor del puntero de base
    ret                     ; Retorna de la función


AND

    pushq   %rbp            ; Guarda el valor del puntero de base
    movq    %rsp, %rbp      ; Establece el puntero de base al valor del puntero de pila
    movl    $1, -64(%rbp)   ; Asigna el valor 1 a la variable en -64(%rbp)
    movl    $3, -8(%rbp)    ; Asigna el valor 3 a la variable en -8(%rbp)
    movl    -64(%rbp), %edx ; Mueve el valor de -64(%rbp) al registro %edx
    movl    -8(%rbp), %eax  ; Mueve el valor de -8(%rbp) al registro %eax
    andl    %edx, %eax      ; Realiza la operación AND entre %edx y %eax
    popq    %rbp            ; Restaura el valor del puntero de base
    ret                     ; Retorna de la función

OR

    pushq   %rbp            ; Guarda el valor del puntero de base
    movq    %rsp, %rbp      ; Establece el puntero de base al valor del puntero de pila
    movl    $1, -64(%rbp)   ; Asigna el valor 1 a la variable en -64(%rbp)
    movl    $3, -8(%rbp)    ; Asigna el valor 3 a la variable en -8(%rbp)
    movl    -64(%rbp), %edx ; Mueve el valor de -64(%rbp) al registro %edx
    movl    -8(%rbp), %eax  ; Mueve el valor de -8(%rbp) al registro %eax
    orl     %edx, %eax      ; Realiza la operación OR entre %edx y %eax
    popq    %rbp            ; Restaura el valor del puntero de base
    ret                     ; Retorna de la función

