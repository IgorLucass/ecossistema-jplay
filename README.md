# ecossistema-jplay

Trabalho Prático CSI032.


---------------------------
* ENUNCIADO DO TRABALHO:
---------------------------

Este trabalho consiste em criar um ecossistema.

   Criar um ambiente onde seja possível colocar atores (aqueles que agem sobre o ambiente ou entre si), e fazê-los agir ou dizer suas possibilidades de ação. Esse ambiente deve conter o mapa do mundo (por padrão e início de projeto, com tamanho 16x16), sendo este mapa é uma matriz de caracteres. Este ambiente deve conseguir identificar onde está cada ator nesse mapa.
    
   Ator é uma classe que é composto por, pelo menos, um sistema, sendo sistema locomotor, digestivo, entre outros que desejar. Essa classe pode conter mais de um sistema do mesmo tipo (dois ou mais sistemas locomotores, por exemplo). Além disso, o ator deve conter sua localização no mapa, seu nome (um caráter) e sua energia. Na classe deve ser possível executar uma ação: executar a ação de um sistema específico que este ator tem. Por exemplo, o sistema locomotor andar para a direita, logo, quando é feito a ação, deve-se ir no sistema locomotor e fazer o ator andar. Cada ação executada é consumida uma quantidade de energia, porém, o sistema digestivo pode recuperar uma parte dessa energia. Caso o ator fique com energia 0 (ou menos) o ator deve ser excluído do ambiente (ou seja, o ator morreu). 

   Deve-se, também, criar um método que deve entregar uma lista de possibilidades de ações que ator pode fazer. (Todas as possibilidades de ações que ator pode ter. Cada sistema pode realizar uma ou mais ações). Cada sistema criado deve conseguir entregar uma lista de possibilidade de ações que esses sistema pode realizar. E deve-se criar um método que realize a ação. O sistema locomotor deve fazer com que o ator ande para algum lugar. Podendo andar somente para cima, somente para baixo, para todo os lugares. Ou seja, o movimento pode serlimitado ou não. Quando o ator locomove, uma quantidade de energia deve ser consumida para isso. 

   O sistema digestivo deve ser capaz de olhar ao seu redor e pode devorar o que estiver em volta, desde que o que está envolta faz parte da sua lista de atores que ele é capaz de devorar. Quando o ator devora outro, ele recebe uma quantidade energia e o ator devorador deve ser excluído do mapa.
    
   Nesse ecossistema deve executar uma ação de cada ator por vez. Por exemplo foram adicionados ao ecossistema dois atores ‘A’ e ‘B’, nessa ordem. Então irá executar uma ação de ‘A’ e depois uma ação de ‘B’, em seguida o ‘A’ novamente e assim sucessivamente.

------------------------
* AVALIAÇÕES DO PROJETO:
------------------------

- [ ] (+5)  Criar classe sistema e todos os seus atributos e métodos 
- [ ] (+10) Criar a classe ator e todos os seus atributos e métodos.
- [ ] (+10) Criar a classe ambiente e todos os seus atrubutos e métodos 
- [ ] (+5)  Mostrar a execução símples com 3 atores com algum(s) sistema(s) locomotor(es) e digestivo(s) (pelo menos um de cada).
- [ ] (+5)  Identação do código .
- [ ] (+5)  Criar mais um sistema qualquer, a sua escolha, que aja sobre ambiente ou sobre outro ator. 
- [ ] (+5)  Executar uma instância onde contém 6 atores que deve interagir com o ambiente, e deve parar de executar quando tiver um único ator ou que a energia de todos acabem. (Ou seja, não precisa fazer um ator devorar o outro).

- [ ] (+5) Não utilizar JAVA
- [ ] (+5) Para cada sistema diferente (tirando os três anteriores) e mostrar ele funcionando.
- [ ] (+5) Interface Gráfica.
- [ ] (+5) Inteligência, não atores (ou em alguns).
