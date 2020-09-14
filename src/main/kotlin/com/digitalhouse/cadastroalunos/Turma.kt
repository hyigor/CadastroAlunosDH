package com.digitalhouse.cadastroalunos

class Turma(override val nome: String, val curso: Curso) : INomeavel{
    override fun toString(): String {
        var `return` = "Turma: $nome\nCurso: ${curso.nome}\nProfessor: ${curso.professor.nome}\nAlunos:\n"
        for(aluno in curso.listaAlunos){
            `return` += "\t${aluno.nome} ${aluno.sobrenome}\n"
        }
        return `return`
    }
}