1- criando novo projeto
* Nome
* nome do pacote
* local da pasta do projeto
* linguagem e SDK mínimo

2- explicando a IDE (explicação e organização das pastas)
* Manifests 
	-> AndroidManifest.xml

* Java
	-> pasta principal, contém os códigos (kotlin ou java) do nosso projeto
	-> androidTest (testes que rodam no dispositivos)
	-> test (testes que rodam no pc)

* res
	-> drawable (icones, imagens)
	-> layout (layout de todas as telas do app)

* values (cor, string, dark e light theme)

* gradle scripts 
	-> build.gradle (project) 
	-> build.gradle (module) aqui add as dependencias para novas bibliotecas

3- configurando emulador e celular físico
* AVD manager (emulador)
	-> create virtual devide
	-> escolher um modelo (preferencia aos que têm icone da play store)
	-> escolher api level
* no dispositivo físico, é necessario cabo usb e que a opção de desenvolvedor esteja ativada
	-> após ativar o modo desenvolvedor, volte na lista das configurações, procure a opção de 'opções do desenvolvedor' e confere se a 'depuração USB' esá ativa


4- mexendo no layout (arquivos .xml)
* editor visual (opção design no canto superior direito)
	-> Palette (lado esquerdo do editor visual) contém varios tipos de componentes:botoes, textos, tipos de layout etc, só procurar oq quer e arrastar pro retângulo branco no meio do editor
	-> Attributes (lado direito do editor visual) lá é possível mudar o tamanho, cor, centralizar, margem etc
	
* código (opção code no canto superior direito) 
	-> escrever na mão todos os componentes e seus atributos

* editor visual + codigo (opção split no canto superior direito)

* constraint layout: é um modo para estruturar e organizar os componentes da tela. Todo componente colocado dentro do constraintLayout, precisará que adicione os constraits (cima, baixo e lados), ancorando nas bordas da tela ou em outro componente