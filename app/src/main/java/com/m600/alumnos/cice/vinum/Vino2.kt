package com.m600.alumnos.cice.vinum
import android.graphics.Bitmap


class Vino2 {



    companion object Factory{

        fun create():Vino2 = Vino2()

    }

    //var ID: String ?= null
    var nombre: String ?= null
    var anio: Long ?= null
    var uva: String ?= null
    var grados: String ?= null
    var origen: String ?= null
    var bodega: String ?= null
    var descripcion: String ?= null
    var puntuacion: Long ?= null
    var imagen: Bitmap ?= null
    //Almacena la URL de la cual se obtendrá la imagen
    var imagenUrl: String ?= null



}