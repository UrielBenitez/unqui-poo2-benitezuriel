!classDefinition: #MascotaTest category: #'OBJ2-TP5'!
TestCase subclass: #MascotaTest
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP5'!

!MascotaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 18:18:07'!
test001_UnaMascotaSabeResponderSuNombre

	| unaMascota |
	unaMascota := Mascota llamada: 'Max' deLaRaza: 'Coker'.
	Assert that: unaMascota nombre isEqualTo: 'Max'! !

!MascotaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 18:20:19'!
test002_UnaMascotaSabeResponderSuRaza

	| unaMascota |
	unaMascota := Mascota llamada: 'Max' deLaRaza: 'Coker'.
	Assert that: unaMascota raza isEqualTo: 'Coker'! !


!classDefinition: #PersonaTest category: #'OBJ2-TP5'!
TestCase subclass: #PersonaTest
	instanceVariableNames: 'otraPersona'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP5'!

!PersonaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 17:56:40'!
test001_UnaPersonaSabeResponderSuNombre

	| unaPersona |
	unaPersona := Persona llamada: 'Uriel Benitez' nacida: (Date newDay: 25 month: 3 year: 2004).
	Assert that: unaPersona nombre isEqualTo: 'Uriel Benitez'! !

!PersonaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 17:57:35'!
test002_UnaPersonaSabeResponderSuFechaDeNacimiento

	| unaPersona |
	unaPersona := Persona llamada: 'Uriel Benitez' nacida: (Date newDay: 25 month: 3 year: 2004).
	Assert that: unaPersona fechaDeNacimiento isEqualTo: (Date newDay: 25 month: 3 year: 2004)! !

!PersonaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 18:02:41'!
test003_UnaPersonaSabeResponderSuEdad

	| unaPersona |
	unaPersona := Persona llamada: 'Uriel Benitez' nacida: (Date newDay: 25 month: 3 year: 2004).
	Assert that: unaPersona edad isEqualTo: 21.! !

!PersonaTest methodsFor: 'as yet unclassified' stamp: 'UB 9/21/2025 18:20:47'!
test004_UnaPersonaSabeSiEsMenorQueOtra

	| unaPersona |
	unaPersona := Persona llamada: 'Uriel Benitez' nacida: (Date newDay: 25 month: 3 year: 2004).
	otraPersona := Persona llamada: 'Pepe González' nacida: (Date newDay: 10 month: 1 year: 2001).
	Assert isTrue: unaPersona < otraPersona.! !


!classDefinition: #Mascota category: #'OBJ2-TP5'!
Object subclass: #Mascota
	instanceVariableNames: 'nombre raza'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP5'!

!Mascota methodsFor: 'initialization' stamp: 'UB 9/21/2025 18:19:51'!
inicializarMascotaLlamada: unNombre deLaRaza: unaRaza 
	
	nombre := unNombre.
	raza := unaRaza! !


!Mascota methodsFor: 'accessing' stamp: 'UB 9/21/2025 18:20:02'!
nombre
	
	^nombre! !

!Mascota methodsFor: 'accessing' stamp: 'UB 9/21/2025 18:20:27'!
raza
	
	^raza! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Mascota class' category: #'OBJ2-TP5'!
Mascota class
	instanceVariableNames: ''!

!Mascota class methodsFor: 'instance creation' stamp: 'UB 9/21/2025 18:18:50'!
llamada: unNombre deLaRaza: unaRaza

	^self new inicializarMascotaLlamada: unNombre deLaRaza: unaRaza ! !


!classDefinition: #Persona category: #'OBJ2-TP5'!
Object subclass: #Persona
	instanceVariableNames: 'nombre fechaDeNacimiento'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP5'!

!Persona methodsFor: 'initialization' stamp: 'UB 9/21/2025 17:56:23'!
inicializarPersonaLlamada: unNombre nacidaEn: unaFecha 
	
	nombre := unNombre.
	fechaDeNacimiento := unaFecha! !


!Persona methodsFor: 'accessing' stamp: 'UB 9/21/2025 18:07:05'!
< unaPersona 
	^ self edad < unaPersona edad! !

!Persona methodsFor: 'accessing' stamp: 'UB 9/21/2025 18:03:46'!
edad
	
	^ Date today yearNumber - fechaDeNacimiento yearNumber ! !

!Persona methodsFor: 'accessing' stamp: 'UB 9/21/2025 17:57:51'!
fechaDeNacimiento
	
	^fechaDeNacimiento! !

!Persona methodsFor: 'accessing' stamp: 'UB 9/21/2025 17:56:49'!
nombre
	
	^nombre! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Persona class' category: #'OBJ2-TP5'!
Persona class
	instanceVariableNames: ''!

!Persona class methodsFor: 'instance creation' stamp: 'UB 9/21/2025 17:55:46'!
llamada: unNombre nacida: unaFecha 
	
	^self new inicializarPersonaLlamada: unNombre nacidaEn: unaFecha ! !
