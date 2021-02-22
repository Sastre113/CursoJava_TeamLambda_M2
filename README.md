  
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

### 1. Descripción

##### UD10 - JAVA Exceptions
 - ##### Hito 1
```java
El sistema de pagament dependrà de l’empleat. Hi ha quatre tipus:
	- Manager: cobren un 10% més del seu salari mensual.
	- Boss: cobren un 50% més del seu salari mensual.
	- Employee: cobren el sou mensual aplicant una reducció del 15%
	- Volunteer: no cobren
S’ha de crear un projecte, C# de consola, amb les funcionalitats demanades 
per tal que el software funcioni correctament.

```
- ##### Hito 2
```Java
Modifica el programa perquè existeixin 3 tipus d'empleats. Junior, Mid i Senior.
Han d'heretar d'empleats. Aquests empleats tenen una reducció del: 15, 10 i 5% de 
	sou respectivament respecte a la base.

Afegeix una validació de sous al introduir-los (utilitza excepcions):
	• Boss: Ha de cobrar més de 8000€
	• Manager: Ha de cobrar més de 3000 però menys de 5000€
	• Senior: Ha de cobrar més de 2700 pero menys de 4000€
	• Mid: Ha de cobrar més de 1800 pero menys de 2500€
	• Junior: Ha de cobrar més de 900 pero menys de 1600€ 
	• Volunteer: S'ha de validar que no cobra.

```

 - ##### Hito 3
 ```java
Fes una modificació als models, aquest han de tenir sou net y brut mensual, 
	sou net y brut anual. 

El sou net s’ha d’autocalcular al restar el % d’IRPF del sou brut 
	(Boss: 32% ,Manager: 26% ,Senior: 24%, Mid: 15%, Junior: 2%).

El voluntari pot tenir un ajut governamental podent cobrar fins a 300€ 
	però s'ha d'indicar que és un ajut.

Has de crear una funció que permeti emetre un bonus a tota la plantilla. 
	Aquest bonus és un 10% del sou anual de cada empleat. 
	Els volunteers no reben aquest bonus.
```

### 2. Organización del código
- src
	- auxiliares
		- AuxMethod.java
	- excepciones
		- SueldoExcepcion.java
	- hitos
		- Hito1.java
		- Hito2.java
		- Hito3.java
	- main
		- MainApp.java
		- Menu.java
	- models_h1
		- Boss_h1.java
		- Empleado_h1.java
		- Manager_h1.java
		- Voluntario_h1.java
	- models_h2
		- Boss_h2.java
		- Empleado_h2.java
		- Manager_h2.java
		- Voluntario_h2.java
		- Senior_h2.java
		- Mid_h2.java
		- Junior_h2.java
	- models_h3
		- Boss_h3.java
		- Empleado_h3.java
		- Manager_h3.java
		- Voluntario_h3.java
		- Senior_h3.java
		- Mid_h3.java
		- Junior_h3.java
	- view_h3
		-Empresa.java

### 3. Clonar y ejecutar

```
IDE               Eclipse IDE Java Developers
Core              Java            
```
Para ejecutar los ejercicios debemos arrancar desde "MainApp.java". Cada ejercicio tiene un MainApp independiente

###### Install
```
Eclipse    https://www.eclipse.org/downloads/packages/
```