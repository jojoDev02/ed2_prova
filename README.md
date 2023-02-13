#  ARVORE AVL > DETERMINANDO AS ROTAÇÕES

Q = R -L

Se -1 <= Q <= 1:  árvore equilibrada

Se Q > 1:
	
	Se a sub-árvore da direita tem Q < 0: rotação dupla à esquerda
		
	Se não: rotação à esquerda
		
Se Q < -1:
	
	Se a sub-árvore da esquerda tem Q > 0: rotação dupla à direita
	
	Se não: rotação à direita
 
 
 # ARVORE B > PROPRIEDADE E APLICAÇÕES
 
 Para qualquer inteiro positivo par M, uma árvore B (B-tree) de ordem M é uma árvore com as seguintes propriedades:

    Cada nó contém no máximo M−1 chaves,
    
    A raiz contém no mínimo 2 chaves e cada um dos demais nós contém no mínimo M/2 chaves,
    
    Cada nó que não seja uma folha tem um filho para cada uma de suas chaves, ou seja, o número de filhos do nó deve ser o número de chaves +1
    
    Todos os caminhos da raiz até uma folha têm o mesmo comprimento (ou seja, a árvore é perfeitamente balanceada). 

Uma árvore B de ordem 4 é essencialmente uma árvore 2-3 (embora existam algumas difereças que destacaremos adiante).

APLICAÇÕES:

Árvores B são a estrutura subjacente a muitos sistemas de arquivos e bancos de dados.  Por exemplo,

   > o sistema de arquivos NTFS do Windows,
    
   > o sistema de arquivos HFS do Mac,
    
   > os sistemas de arquivos ReiserFS, XFS, Ext3FS, JFS do Linux, e
    
   > os bancos de dados ORACLE, DB2, INGRES, SQL e PostgreSQL. 


