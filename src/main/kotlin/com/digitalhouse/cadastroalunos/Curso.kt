package com.digitalhouse.cadastroalunos

class Curso(override var nome: String):INomeavel {
    var listaAulas: ArrayList<Aula> = arrayListOf()
    var listaAlunos: ArrayList<Aluno> = arrayListOf()

    fun adicionarAulas(aula: Aula) = listaAulas.add(aula)

    fun adicionarAulas(vararg aulas: Aula) = aulas.forEach { adicionarAulas(it) }


    fun adicionarAlunos(aluno: Aluno){
        listaAlunos.add(aluno)
    }

}

