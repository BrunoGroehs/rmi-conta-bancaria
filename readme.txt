Aplicacao RMI - Conta Bancaria

Arquivos:
- ContaBancaria.java     (interface remota)
- ContaBancariaImpl.java (implementacao)
- Servidor.java          (servidor)
- Cliente.java           (cliente)

Requisitos:
- JDK instalado (java e javac no PATH)

Passo a passo:

1. Compile todos os arquivos:
       javac *.java

2. Abra um terminal e inicie o servidor:
       java Servidor

   Vai aparecer: "Servidor iniciado. Saldo inicial: R$1000.00"
   Deixe esse terminal aberto.

3. Abra outro terminal e rode o cliente:
       java Cliente

   O cliente vai depositar, sacar e mostrar o saldo a cada operacao.

4. Para testar varios clientes ao mesmo tempo, abra mais terminais
   e rode "java Cliente" em cada um enquanto o servidor estiver rodando.
