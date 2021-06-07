Algoritmo Ejercicio12
	alturaHombres=0
	alturaMujeres=0
	edadTotal=0
	mujeres=0
	hombres=0
	totalParticipantes=0
	altura=0.1
	Mientras altura<>0 Hacer
		Escribir "Ingrese la altura en Metros"
		leer altura
		Escribir "Ingrese la edad"
		leer edad 
		edadTotal=edadTotal+edad
		totalParticipantes=totalParticipantes+1
		Escribir "Ingrese el sexo,Masuculino=M, Femenino=F"
		leer sexo
		si sexo="F" o sexo= "f" Entonces
			alturaMujeres=alturaMujeres+altura
			mujeres=mujeres+1
			Escribir "Persona de sexo femenino registrada"
		sino si sexo="M" o sexo="m" Entonces
				alturaHombres=alturaHombres+altura
				hombres=hombres+1
				Escribir "Persona de sexo masculino registrado"
			SiNo
				Escribir "El sexo que escribio es incorrecto"
			FinSi
		FinSi
	FinMientras
	promedioAlturaHombres=alturaHombres/hombres
	promedioAlturaMujeres=AlturaMujeres/mujeres
	promedioEdadParticipantes=edadTotal/totalParticipantes
	Escribir "El promedio de altura de hombres  es: " promedioAlturaHombres
	Escribir "El promedio de altura de mujeres es: " promedioAlturaMujeres
	Escribir "El promedio de todas las edades es: " promedioEdadParticipantes
	
FinAlgoritmo
