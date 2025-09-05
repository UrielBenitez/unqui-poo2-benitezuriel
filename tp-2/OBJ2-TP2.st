!classDefinition: #EmpresaTest category: #'OBJ2-TP2'!
TestCase subclass: #EmpresaTest
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/25/2025 15:34:22'!
test001_UnaEmpresaAbreSinEmpleados

	| unaEmpresa |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	
	Assert that: unaEmpresa cantidadDeEmpleados isEqualTo: 0! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/25/2025 17:33:11'!
test002_CuandoUnaEmpresaContrataUnaPersonaComoEmpleadoDeCualquierTipo_LaCantidadDeEmpleadosAumenta

	| unaEmpresa unaPersona |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 0 conAñosDeExperiencia: 1 estadoCivil: 'En pareja'.
	
	unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unaEmpresa cantidadDeEmpleados isEqualTo: 1! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/25/2025 17:33:31'!
test003_ElSueldoBásicoDeUnEmpleadoPermanenteEsDeCienmilPesos

	| unaEmpresa unaPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 0 conAñosDeExperiencia: 1 estadoCivil: 'En pareja'.
	
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unEmpleadoPermanente sueldoBásico isEqualTo: 100000 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/25/2025 17:33:37'!
test004_ElSueldoBásicoDeUnEmpleadoTemporalEsDeOchentamilPesos

	| unaEmpresa unaPersona unEmpleadoTemporal |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 0 conAñosDeExperiencia: 1  estadoCivil: 'En pareja'.
	
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25)	 trabajandoExtraPorJornada: 3.
	
	Assert that: unEmpleadoTemporal sueldoBásico isEqualTo: 80000 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/25/2025 17:33:50'!
test005_UnEmpleadoSabeResponderSuEdad

	| unaEmpresa unaPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 0 conAñosDeExperiencia: 1 estadoCivil: 'En pareja'.
	
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unEmpleadoPermanente edad isEqualTo: 21! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 14:24:42'!
test006_UnEmpleadoPermanenteSabeCalcularSuSueldoBruto

	| unaEmpresa unaPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unEmpleadoPermanente sueldoBruto isEqualTo: 100600 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 14:26:56'!
test007_UnEmpleadoTemporalSabeCalcularSuSueldoBruto

	| unaEmpresa unaPersona unEmpleadoTemporal |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	
	Assert that: unEmpleadoTemporal sueldoBruto isEqualTo: 80120 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 14:48:27'!
test008_UnEmpleadoTemporalSabeCalcularSusRetenciones

	| unaEmpresa unaPersona unEmpleadoTemporal |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	
	Assert that: unEmpleadoTemporal retenciones isEqualTo: 16039 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 14:59:45'!
test009_UnEmpleadoPermanenteSabeCalcularSusRetenciones

	| unaEmpresa unaPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unEmpleadoPermanente retenciones isEqualTo: 25190 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 15:16:53'!
test010_UnEmpleadoPermanenteSabeCalcularSuSueldoNeto

	| unaEmpresa unaPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
	
	Assert that: unEmpleadoPermanente sueldoNeto isEqualTo: 75410 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 15:19:43'!
test011_UnEmpleadoTemporalSabeCalcularSuSueldoNeto

	| unaEmpresa unaPersona unEmpleadoTemporal |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	
	Assert that: unEmpleadoTemporal sueldoNeto isEqualTo: 64081 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 15:27:57'!
test012_LaEmpresaNoContabilizaEmpleadosYaContratados

	| unaEmpresa unaPersona unEmpleadoTemporal |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	
	unaEmpresa contratarComoEmpleadoPermanenteA: unaPersona.
		
	Assert that: unaEmpresa cantidadDeEmpleados isEqualTo: 1! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 16:08:10'!
test013_UnaEmpresaSabeResponderCuántoDineroDebePagarEnSueldosASusEmpleados

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
		
	Assert that: unaEmpresa totalNetoEnSueldos isEqualTo: 64081 * peso + (75467.5 * peso)! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 15:56:18'!
test014_UnaEmpresaSabeResponderCuántoDineroCorrespondeASusEmpleadosEnSueldosBrutos

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
		
	Assert that: unaEmpresa totalBrutoEnSueldos isEqualTo: 180770 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 17:06:56'!
test015_UnaEmpresaSabeResponderCuántoDineroRetieneASusEmpleados

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
	
	Assert that: unaEmpresa totalEnRetenciones isEqualTo: 41221.5 * peso
		
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/26/2025 17:06:18'!
test016_UnaEmpresaSabeRealizarLaLiquidaciónDeSueldosASusEmpleados

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
	
	unaEmpresa liquidarSueldos.
		
	Assert isTrue: unEmpleadoTemporal cobróHoy.
	Assert isTrue: unEmpleadoPermanente cobróHoy.! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 15:25:43'!
test017_UnaEmpresaPuedeContratarPersonasBajoLaCategoriaDeEmpleadoContratado

	| unaEmpresa unaPersona |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja'.
	
	unaEmpresa contratarComoEmpleadoContratadoA: unaPersona pagandoleCon: 'Cheque'.
	
	Assert that: unaEmpresa cantidadDeEmpleados isEqualTo: 1! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 15:46:46'!
test018_UnEmpleadoContratadoSabeCalcularSuSueldoBásico

	| unaEmpresa unaPersona unEmpleadoContratado |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja'.
	
	unEmpleadoContratado := unaEmpresa contratarComoEmpleadoContratadoA: unaPersona pagandoleCon: 'Cheque'.
	
	Assert that: unEmpleadoContratado sueldoBásico isEqualTo: 90000 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 15:47:42'!
test019_UnEmpleadoContratadoSabeCalcularSuSueldoBruto_QueEsIgualASuSueldoBásico

	| unaEmpresa unaPersona unEmpleadoContratado |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja'.
	
	unEmpleadoContratado := unaEmpresa contratarComoEmpleadoContratadoA: unaPersona pagandoleCon: 'Cheque'.
	
	Assert that: unEmpleadoContratado sueldoBruto isEqualTo: 90000 * peso! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 15:59:15'!
test020_UnEmpleadoContratadoSabeCalcularSuSueldoNeto_QueEs50PesosMenorASueldoBrutoPorRetencionesFijas

	| unaEmpresa unaPersona unEmpleadoContratado |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja'.
	
	unEmpleadoContratado := unaEmpresa contratarComoEmpleadoContratadoA: unaPersona pagandoleCon: 'Cheque'.
	
	Assert that: unEmpleadoContratado sueldoNeto isEqualTo: 90000 * peso - (50 * peso)! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 16:10:36'!
test021_UnaEmpresaSabeResponderCuántoDineroDebePagarEnSueldosASusEmpleados_EmpleadoContratadoAgregado

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente otraPersonaMás unEmpleadoContratado |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	otraPersonaMás := Persona llamada: 'Carlos' queViveEn: '3 y 20'  nacidaEn: (Date year: 1986 month: 9  day: 23 ) conHijos: 3 conAñosDeExperiencia:  18 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
	unEmpleadoContratado := unaEmpresa contratarComoEmpleadoContratadoA: otraPersonaMás pagandoleCon: 'Transferencia'. 
		
	Assert that: unaEmpresa totalNetoEnSueldos isEqualTo: 64081 * peso + (75467.5 * peso) + (89950 * peso)! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'UB 8/27/2025 17:16:30'!
test022_UnaEmpresaSabeRealizarLaLiquidaciónDeSueldosASusEmpleados_IncluidosEmpleadosContratados

	| unaEmpresa unaPersona unEmpleadoTemporal otraPersona unEmpleadoPermanente otraPersonaMás unEmpleadoContratado |
	unaEmpresa := Empresa razónSocial: 'Empresa-Prueba' cuit: 20406103021.
	unaPersona := Persona llamada: 'Uriel' queViveEn: '11 y 6' nacidaEn: (Date year: 2004 month: 3 day: 25) conHijos: 2 conAñosDeExperiencia: 4 estadoCivil: 'En pareja' .
	otraPersona := Persona llamada: 'Agustin' queViveEn: '10 y 5'  nacidaEn: (Date year: 1996 month: 4  day: 13 ) conHijos: 1  conAñosDeExperiencia:  10 estadoCivil: 'Soltero'.
	unEmpleadoTemporal := unaEmpresa contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: (Date year: 2026 month: 3 day: 25) trabajandoExtraPorJornada: 3 .
	unEmpleadoPermanente := unaEmpresa contratarComoEmpleadoPermanenteA: otraPersona.
	otraPersonaMás := Persona llamada: 'Carlos' queViveEn: '2 y 15'  nacidaEn: (Date year: 1986 month: 7  day: 23 ) conHijos: 3  conAñosDeExperiencia:  18 estadoCivil: 'Soltero'.
	unEmpleadoContratado := unaEmpresa contratarComoEmpleadoContratadoA: otraPersonaMás pagandoleCon: 'Transferencia'.
	
	unaEmpresa liquidarSueldos.
		
	Assert isTrue: unEmpleadoTemporal cobróHoy.
	Assert isTrue: unEmpleadoPermanente cobróHoy.
	Assert isTrue: unEmpleadoContratado cobróHoy.! !


!classDefinition: #Empleado category: #'OBJ2-TP2'!
Object subclass: #Empleado
	instanceVariableNames: 'nombre fechaDeNacimiento dirección estadoCivil últimoRecibo empresa'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!Empleado methodsFor: 'private' stamp: 'UB 8/26/2025 14:40:17'!
bonificaciones

	self subclassResponsibility! !

!Empleado methodsFor: 'private' stamp: 'UB 8/26/2025 17:15:11'!
cobróHoy
	
	^ (últimoRecibo isKindOf: ReciboDeHaberes) and: [últimoRecibo fechaDeEmisión = Date today]! !


!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 17:22:59'!
dirección
	
	^ dirección! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/25/2025 17:06:52'!
edad
	
	^ Date today yearNumber - self fechaDeNacimiento yearNumber! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 17:22:38'!
empresa
	
	^empresa! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:22:23'!
estadoCivil

	^ estadoCivil! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/25/2025 17:07:20'!
fechaDeNacimiento
	
	^fechaDeNacimiento! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 17:23:31'!
nombre
	
	^ nombre! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:26:22'!
retenciones
	
	^ self retenciónObraSocial + self retenciónAportesYJubilaciones! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:27:58'!
retenciónAportesYJubilaciones

	self subclassResponsibility! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:27:48'!
retenciónObraSocial

	self subclassResponsibility! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:32:19'!
sueldoBásico

	self subclassResponsibility! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:39:22'!
sueldoBruto
	
	^ self sueldoBásico + self bonificaciones! !

!Empleado methodsFor: 'accessing' stamp: 'UB 8/26/2025 15:19:56'!
sueldoNeto
	
	^ self sueldoBruto - self retenciones! !


!Empleado methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:34:04'!
= anObject

	self subclassResponsibility! !

!Empleado methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:36:01'!
hash

	self subclassResponsibility! !


!Empleado methodsFor: 'acciones' stamp: 'UB 8/27/2025 15:00:11'!
liquidarSueldo

	self subclassResponsibility! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empleado class' category: #'OBJ2-TP2'!
Empleado class
	instanceVariableNames: ''!

!Empleado class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 15:34:44'!
empleadoContratadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: unaEmpresa  
	
	^ EmpleadoContratado nuevoEmpleadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: unaEmpresa ! !

!Empleado class methodsFor: 'instance creation' stamp: 'UB 8/26/2025 14:06:59'!
empleadoDePlantaPermanenteSegún: unaPersona trabajandoPara: unaEmpresa 
	
	^ EmpleadoPermanente nuevoEmpleadoSegún: unaPersona trabajandoPara: unaEmpresa! !

!Empleado class methodsFor: 'instance creation' stamp: 'UB 8/26/2025 16:59:20'!
empleadoTemporalSegún: unaPersona conDuraciónDeContratoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: unaEmpresa    
	
	^EmpleadoTemporal nuevoEmpleadoSegún: unaPersona contratadoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: unaEmpresa! !


!classDefinition: #EmpleadoContratado category: #'OBJ2-TP2'!
Empleado subclass: #EmpleadoContratado
	instanceVariableNames: 'númeroDeContrato medioDePago'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!EmpleadoContratado methodsFor: 'initialization' stamp: 'UB 8/27/2025 15:37:04'!
inicializarNuevoEmpleadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: unaEmpresa  
	
	nombre := unaPersona nombre.
	dirección := unaPersona dirección.
	fechaDeNacimiento := unaPersona fechaDeNacimiento.
	estadoCivil := unaPersona estadoCivil .
	empresa := unaEmpresa.
	númeroDeContrato := unaEmpresa nuevoContrato.
	medioDePago := unMedioDePago.
	! !


!EmpleadoContratado methodsFor: 'comparing' stamp: 'UB 8/27/2025 15:42:14'!
hash
	
	^ self númeroDeContrato hash! !


!EmpleadoContratado methodsFor: 'accessing' stamp: 'UB 8/27/2025 15:54:02'!
bonificaciones
	
	^ 0 * peso! !

!EmpleadoContratado methodsFor: 'accessing' stamp: 'UB 8/27/2025 15:42:28'!
númeroDeContrato
	
	^númeroDeContrato! !

!EmpleadoContratado methodsFor: 'accessing' stamp: 'UB 8/27/2025 15:58:27'!
retenciones

	^ 50 * peso! !

!EmpleadoContratado methodsFor: 'accessing' stamp: 'UB 8/27/2025 15:47:12'!
sueldoBásico
	
	^ 90000 * peso! !


!EmpleadoContratado methodsFor: 'acciones' stamp: 'UB 8/27/2025 17:17:19'!
liquidarSueldo
	
	últimoRecibo := ReciboDeHaberes reciboParaEmpleadoContratado: self! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoContratado class' category: #'OBJ2-TP2'!
EmpleadoContratado class
	instanceVariableNames: ''!

!EmpleadoContratado class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 15:35:28'!
nuevoEmpleadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: unaEmpresa  

	^self new inicializarNuevoEmpleadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: unaEmpresa ! !


!classDefinition: #EmpleadoPermanente category: #'OBJ2-TP2'!
Empleado subclass: #EmpleadoPermanente
	instanceVariableNames: 'cantidadDeHijos antiguedad'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!EmpleadoPermanente methodsFor: 'initialization' stamp: 'UB 8/26/2025 14:14:18'!
inicializarEmpleadoSegún: unaPersona trabajandoPara: unaEmpresa 
	
	nombre := unaPersona nombre.
	fechaDeNacimiento := unaPersona fechaDeNacimiento.
	dirección := unaPersona dirección.
	cantidadDeHijos := unaPersona cantidadDeHijos.
	antiguedad := unaPersona antiguedad.
	estadoCivil := unaPersona estadoCivil.
	empresa := unaEmpresa! !


!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:18:51'!
añosDeExperiencia
	
	^ antiguedad ! !

!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:19:29'!
bonificaciones
	
	^ (empresa bonoPorHijoPara: self) + (empresa bonoPorCónyugePara: self) + (empresa bonoPorAntigüedadPara: self)! !

!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:11:40'!
cantidadDeHijos
	
	^cantidadDeHijos! !

!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:27:32'!
retenciónAportesYJubilaciones
	
	^ 0.15 * self sueldoBruto! !

!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:27:12'!
retenciónObraSocial
	
	^ 0.1 * self sueldoBruto + (20 * peso * cantidadDeHijos)! !

!EmpleadoPermanente methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:20:26'!
sueldoBásico
	
	^ 100000 * peso! !


!EmpleadoPermanente methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:37:06'!
= anObject

	^ (anObject isKindOf: self Empleado) and: [anObject nombre = self nombre]! !

!EmpleadoPermanente methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:36:01'!
hash

	^ nombre hash! !



!EmpleadoPermanente methodsFor: 'acciones' stamp: 'UB 8/27/2025 17:03:25'!
liquidarSueldo
	
	^ últimoRecibo := ReciboDeHaberes reciboParaEmpleadoPermanente: self ! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoPermanente class' category: #'OBJ2-TP2'!
EmpleadoPermanente class
	instanceVariableNames: ''!

!EmpleadoPermanente class methodsFor: 'instance creation' stamp: 'UB 8/26/2025 14:08:28'!
nuevoEmpleadoSegún: unaPersona trabajandoPara: unaEmpresa 

	^ self new inicializarEmpleadoSegún: unaPersona trabajandoPara: unaEmpresa! !


!classDefinition: #EmpleadoTemporal category: #'OBJ2-TP2'!
Empleado subclass: #EmpleadoTemporal
	instanceVariableNames: 'fechaDeFin cantidadDeHorasExtra'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!


!EmpleadoTemporal methodsFor: 'initialization' stamp: 'UB 8/26/2025 14:31:53'!
inicializarEmpleadoSegún: unaPersona contratadoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: unaEmpresa  
	
	nombre := unaPersona nombre.
	dirección := unaPersona dirección.
	fechaDeNacimiento := unaPersona fechaDeNacimiento.
	fechaDeFin := unaFecha.
	cantidadDeHorasExtra := unaCantidadDeHorasExtra.
	empresa := unaEmpresa! !


!EmpleadoTemporal methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:28:06'!
bonificaciones
	
	^ empresa bonoPorHorasExtraPara: self! !

!EmpleadoTemporal methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:32:38'!
cantidadDeHorasExtra
	
	^cantidadDeHorasExtra! !

!EmpleadoTemporal methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:24:48'!
retenciónAportesYJubilaciones
	
	^ 0.1 * self sueldoBruto + (5 * peso * cantidadDeHorasExtra )! !

!EmpleadoTemporal methodsFor: 'accessing' stamp: 'UB 8/27/2025 14:24:15'!
retenciónObraSocial
	
	^ self edad > 50 ifTrue: [0.1 * self sueldoBruto + (25 * peso)] ifFalse: [0.1 * self sueldoBruto]! !

!EmpleadoTemporal methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:30:26'!
sueldoBásico
	
	^ 80000 * peso! !


!EmpleadoTemporal methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:36:58'!
= anObject

	^ (anObject isKindOf: Empleado) and: [anObject nombre = self nombre]! !

!EmpleadoTemporal methodsFor: 'comparing' stamp: 'UB 8/26/2025 15:36:01'!
hash

	^ nombre hash! !


!EmpleadoTemporal methodsFor: 'acciones' stamp: 'UB 8/27/2025 17:04:00'!
liquidarSueldo
	
	últimoRecibo := ReciboDeHaberes reciboParaEmpleadoTemporal: self! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoTemporal class' category: #'OBJ2-TP2'!
EmpleadoTemporal class
	instanceVariableNames: ''!

!EmpleadoTemporal class methodsFor: 'instance creation' stamp: 'UB 8/26/2025 14:31:32'!
nuevoEmpleadoSegún: unaPersona contratadoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: unaEmpresa  
	
	^self new inicializarEmpleadoSegún: unaPersona contratadoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: unaEmpresa! !


!classDefinition: #Empresa category: #'OBJ2-TP2'!
Object subclass: #Empresa
	instanceVariableNames: 'nombre cuit bonoPorEstadoCivil empleados bonoPorCantidadDeHijos bonoPorAntigüedad bonoPorHorasExtra próximoNúmeroDeContrato'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!Empresa methodsFor: 'initialization' stamp: 'UB 8/27/2025 15:40:14'!
inicializarCon: unNombre cuit: unCUIT 
	
	nombre := unNombre.
	cuit := unCUIT.
	empleados := Set new.
	bonoPorEstadoCivil := Dictionary new.
	bonoPorEstadoCivil at: 'Soltero' put: 0 * peso.
	bonoPorEstadoCivil at: 'En pareja' put: 100 * peso.
	bonoPorCantidadDeHijos := 150 * peso.
	bonoPorAntigüedad := 50 * peso.
	bonoPorHorasExtra := 40 * peso.
	próximoNúmeroDeContrato := 0.! !


!Empresa methodsFor: 'private accesing' stamp: 'UB 8/26/2025 14:17:08'!
bonoPorAntigüedadPara: unEmpleado 
	
	^ bonoPorAntigüedad * unEmpleado añosDeExperiencia! !

!Empresa methodsFor: 'private accesing' stamp: 'UB 8/26/2025 14:12:55'!
bonoPorCónyugePara: unEmpleado 
	
	^ bonoPorEstadoCivil at: unEmpleado estadoCivil! !

!Empresa methodsFor: 'private accesing' stamp: 'UB 8/26/2025 14:15:31'!
bonoPorHijoPara: unEmpleado 
	
	^ bonoPorCantidadDeHijos * unEmpleado cantidadDeHijos! !

!Empresa methodsFor: 'private accesing' stamp: 'UB 8/26/2025 14:32:26'!
bonoPorHorasExtraPara: unEmpleado 
	
	^ bonoPorHorasExtra * unEmpleado cantidadDeHorasExtra! !

!Empresa methodsFor: 'private accesing' stamp: 'UB 8/25/2025 15:47:57'!
cantidadDeEmpleados
	
	^ empleados size! !


!Empresa methodsFor: 'acciones' stamp: 'UB 8/27/2025 15:41:10'!
contratarComoEmpleadoContratadoA: unaPersona pagandoleCon: unMedioDePago 
	
	^ empleados add: (Empleado empleadoContratadoSegún: unaPersona pagandoleCon: unMedioDePago enElLugarDeTrabajo: self)! !

!Empresa methodsFor: 'acciones' stamp: 'UB 8/26/2025 14:05:14'!
contratarComoEmpleadoPermanenteA: unaPersona 
	
	^ empleados add: (Empleado empleadoDePlantaPermanenteSegún: unaPersona trabajandoPara: self)
	! !

!Empresa methodsFor: 'acciones' stamp: 'UB 8/26/2025 16:56:50'!
contratarComoEmpleadoTemporal: unaPersona conDuraciónDeContratoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra
	
	^ empleados add: (Empleado empleadoTemporalSegún: unaPersona conDuraciónDeContratoHasta: unaFecha trabajandoExtraPorJornada: unaCantidadDeHorasExtra enElLugarDeTrabajo: self)! !

!Empresa methodsFor: 'acciones' stamp: 'UB 8/27/2025 14:38:08'!
liquidarSueldos
	
	
	empleados do: [:unEmpleado | unEmpleado liquidarSueldo]! !


!Empresa methodsFor: 'accessing' stamp: 'UB 8/27/2025 15:39:33'!
nuevoContrato
	| númeroDeContratoAOtorgar |
	númeroDeContratoAOtorgar := próximoNúmeroDeContrato.
	próximoNúmeroDeContrato := próximoNúmeroDeContrato + 1.
	^númeroDeContratoAOtorgar! !

!Empresa methodsFor: 'accessing' stamp: 'UB 8/26/2025 15:56:54'!
totalBrutoEnSueldos
	
	^ empleados sum: [:unEmpleado | unEmpleado sueldoBruto] ifEmpty: [0 * peso]! !

!Empresa methodsFor: 'accessing' stamp: 'UB 8/26/2025 15:59:10'!
totalEnRetenciones
	
	^ empleados sum: [:unEmpleado | unEmpleado retenciones] ifEmpty: [0 * peso]! !

!Empresa methodsFor: 'accessing' stamp: 'UB 8/26/2025 15:42:22'!
totalNetoEnSueldos
	
	^ empleados sum: [:unEmpleado | unEmpleado sueldoNeto] ifEmpty: [0 * peso]! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empresa class' category: #'OBJ2-TP2'!
Empresa class
	instanceVariableNames: ''!

!Empresa class methodsFor: 'instance creation' stamp: 'UB 8/25/2025 15:35:36'!
razónSocial: unNombre cuit: unCUIT 
	
	^self new inicializarCon: unNombre cuit: unCUIT! !


!classDefinition: #Persona category: #'OBJ2-TP2'!
Object subclass: #Persona
	instanceVariableNames: 'nombre dirección fechaDeNacimiento cantidadDeHijos antiguedadLaboral estadoCivil obraSocial'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!Persona methodsFor: 'initialization' stamp: 'UB 8/25/2025 17:29:41'!
inicializarPersonaLlamada: unNombre queViveEn: unaDirección nacidaEn: unaFecha conHijos: unaCantidadDeHijos conAñosDeExperiencia: unaCantidadDeAñosDeExperiencia estadoCivil: unEstadoCivil  
	
	nombre := unNombre.
	dirección := unaDirección.
	fechaDeNacimiento := unaFecha.
	cantidadDeHijos := unaCantidadDeHijos.
	antiguedadLaboral := unaCantidadDeAñosDeExperiencia.
	estadoCivil := unEstadoCivil ! !


!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:06:20'!
antiguedad
	
	^ antiguedadLaboral ! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:06:04'!
cantidadDeHijos
	
	^ cantidadDeHijos! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 17:09:28'!
dirección
	
	^dirección! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/26/2025 14:14:31'!
estadoCivil
	
	^estadoCivil! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:41:18'!
fechaDeNacimiento
	
	^fechaDeNacimiento! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 16:16:37'!
nombre
	
	^nombre! !

!Persona methodsFor: 'accessing' stamp: 'UB 8/25/2025 17:30:08'!
obraSocial
	
	^ obraSocial! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Persona class' category: #'OBJ2-TP2'!
Persona class
	instanceVariableNames: ''!

!Persona class methodsFor: 'instance creation' stamp: 'UB 8/25/2025 17:32:47'!
llamada: unNombre queViveEn: unaDirección nacidaEn: unaFecha conHijos: unaCantidadDeHijos conAñosDeExperiencia: unaCantidadDeAñosDeExperiencia estadoCivil: unEstadoCivil 
	
	^self new inicializarPersonaLlamada: unNombre queViveEn: unaDirección nacidaEn: unaFecha conHijos: unaCantidadDeHijos conAñosDeExperiencia: unaCantidadDeAñosDeExperiencia estadoCivil: unEstadoCivil ! !


!classDefinition: #ReciboDeHaberes category: #'OBJ2-TP2'!
Object subclass: #ReciboDeHaberes
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!ReciboDeHaberes methodsFor: 'accessing' stamp: 'UB 8/26/2025 16:36:16'!
fechaDeEmisión
	
	^fechaDeEmisión! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberes class' category: #'OBJ2-TP2'!
ReciboDeHaberes class
	instanceVariableNames: ''!

!ReciboDeHaberes class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:18:35'!
reciboParaEmpleadoContratado: unEmpleadoContratado 

	^ReciboDeHaberesEmpleadoContratado reciboPara: unEmpleadoContratado! !

!ReciboDeHaberes class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:05:16'!
reciboParaEmpleadoPermanente: unEmpleadoPermanente 

	^ReciboDeHaberesEmpleadoPermanente reciboPara: unEmpleadoPermanente ! !

!ReciboDeHaberes class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:04:55'!
reciboParaEmpleadoTemporal: unEmpleadoTemporal 

	^ReciboDeHaberesEmpleadoTemporal reciboPara: unEmpleadoTemporal! !


!classDefinition: #ReciboDeHaberesEmpleadoContratado category: #'OBJ2-TP2'!
ReciboDeHaberes subclass: #ReciboDeHaberesEmpleadoContratado
	instanceVariableNames: 'gastosAdministrativosContractuales'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!ReciboDeHaberesEmpleadoContratado methodsFor: 'initialization' stamp: 'UB 8/27/2025 17:23:27'!
inicializarReciboParaEmpleadoContratado: unEmpleadoContratado 
	
	nombre := unEmpleadoContratado nombre.
	dirección := unEmpleadoContratado dirección .
	fechaDeEmisión := Date today.
	sueldoBruto := unEmpleadoContratado sueldoBruto.
	sueldoNeto := unEmpleadoContratado sueldoNeto.
	gastosAdministrativosContractuales := 50 * peso! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberesEmpleadoContratado class' category: #'OBJ2-TP2'!
ReciboDeHaberesEmpleadoContratado class
	instanceVariableNames: ''!

!ReciboDeHaberesEmpleadoContratado class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:20:14'!
reciboPara: unEmpleadoContratado 

	^self new inicializarReciboParaEmpleadoContratado: unEmpleadoContratado ! !


!classDefinition: #ReciboDeHaberesEmpleadoPermanente category: #'OBJ2-TP2'!
ReciboDeHaberes subclass: #ReciboDeHaberesEmpleadoPermanente
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!ReciboDeHaberesEmpleadoPermanente methodsFor: 'initialization' stamp: 'UB 8/27/2025 17:14:28'!
inicializarReciboParaEmpleadoPermanente: unEmpleadoPermanente 
	| empresaDelEmpleado |
	empresaDelEmpleado := unEmpleadoPermanente empresa.
	nombre := unEmpleadoPermanente nombre.
	dirección := unEmpleadoPermanente dirección .
	fechaDeEmisión := Date today.
	sueldoBruto := unEmpleadoPermanente sueldoBruto.
	sueldoNeto := unEmpleadoPermanente sueldoNeto.
	bonoPorEstadoCivil := empresaDelEmpleado bonoPorCónyugePara: unEmpleadoPermanente.
	bonoPorHijo := empresaDelEmpleado bonoPorHijoPara: unEmpleadoPermanente .
	bonoPorAntigüedad := empresaDelEmpleado bonoPorAntigüedadPara: unEmpleadoPermanente.
	retenciónObraSocial := unEmpleadoPermanente retenciónObraSocial .
	retenciónAportesYJubilaciones := unEmpleadoPermanente retenciónAportesYJubilaciones ! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberesEmpleadoPermanente class' category: #'OBJ2-TP2'!
ReciboDeHaberesEmpleadoPermanente class
	instanceVariableNames: ''!

!ReciboDeHaberesEmpleadoPermanente class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:08:51'!
reciboPara: unEmpleadoPermanente 

	^self new inicializarReciboParaEmpleadoPermanente: unEmpleadoPermanente ! !


!classDefinition: #ReciboDeHaberesEmpleadoTemporal category: #'OBJ2-TP2'!
ReciboDeHaberes subclass: #ReciboDeHaberesEmpleadoTemporal
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'OBJ2-TP2'!

!ReciboDeHaberesEmpleadoTemporal methodsFor: 'initialization' stamp: 'UB 8/27/2025 17:13:56'!
inicializarReciboParaEmpleadoTemporal: unEmpleadoTemporal 
	
	| empresaDelEmpleado |
	empresaDelEmpleado := unEmpleadoTemporal empresa .
	nombre := unEmpleadoTemporal nombre.
	dirección := unEmpleadoTemporal dirección .
	fechaDeEmisión := Date today.
	sueldoBruto := unEmpleadoTemporal sueldoBruto.
	sueldoNeto := unEmpleadoTemporal sueldoNeto.
	bonoPorHorasExtra := empresaDelEmpleado bonoPorHorasExtraPara: unEmpleadoTemporal.
	retenciónObraSocial := unEmpleadoTemporal retenciónObraSocial.
	retenciónAportesYJubilaciones := unEmpleadoTemporal retenciónAportesYJubilaciones 
	! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberesEmpleadoTemporal class' category: #'OBJ2-TP2'!
ReciboDeHaberesEmpleadoTemporal class
	instanceVariableNames: ''!

!ReciboDeHaberesEmpleadoTemporal class methodsFor: 'instance creation' stamp: 'UB 8/27/2025 17:11:43'!
reciboPara: unEmpleadoTemporal 

	^self new inicializarReciboParaEmpleadoTemporal: unEmpleadoTemporal ! !
