package com.digitalhouse.cadastroalunos

class Professor(override val nome: String, val RD: Long) : INomeavel {
    fun darAula(Aula aula){
        println("O professor $nome está dando aula.")
    }

    fun fazerChamada(Aula aula){
        TODO("Falta aula")
    }
}