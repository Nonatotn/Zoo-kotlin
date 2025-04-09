import java.util.Scanner

data class Animal(
    val apelido: String,
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacao: String
)

class Zoologico {
    private val animais = mutableListOf<Animal>()

    fun cadastrarAnimal(animal: Animal) {
        animais.add(animal)
        println("Animal ${animal.apelido} cadastrado com sucesso!")
    }

    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Nenhum animal cadastrado no zoológico.")
        } else {
            println("Lista de animais do zoológico:")
            animais.forEach { animal ->
                println("\nApelido: ${animal.apelido}\n" +
                        "Espécie: ${animal.especie}\n" +
                        "Origem: ${animal.origem}\n" +
                        "Dieta: ${animal.dieta}\n" +
                        "Gaiola: ${animal.tipoGaiola}\n" +
                        "Localização: ${animal.localizacao}\n")
            }
        }
    }
}

fun main() {
    val zoologico = Zoologico()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Deseja cadastrar um novo animal? (s/n)")
        val resposta = scanner.nextLine()
        if (resposta.lowercase() != "s") break

        println("Digite o apelido do animal:")
        val apelido = scanner.nextLine()
        println("Digite o reino do animal:")
        val reino = scanner.nextLine()
        println("Digite o filo do animal:")
        val filo = scanner.nextLine()
        println("Digite a classe do animal:")
        val classe = scanner.nextLine()
        println("Digite a ordem do animal:")
        val ordem = scanner.nextLine()
        println("Digite a família do animal:")
        val familia = scanner.nextLine()
        println("Digite o gênero do animal:")
        val genero = scanner.nextLine()
        println("Digite a espécie do animal:")
        val especie = scanner.nextLine()
        println("Digite a origem do animal:")
        val origem = scanner.nextLine()
        println("Digite a dieta do animal:")
        val dieta = scanner.nextLine()
        println("Digite o tipo de gaiola do animal:")
        val tipoGaiola = scanner.nextLine()
        println("Digite a localização do animal:")
        val localizacao = scanner.nextLine()

        val animal = Animal(apelido, reino, filo, classe, ordem, familia, genero, especie, origem, dieta, tipoGaiola, localizacao)
        zoologico.cadastrarAnimal(animal)
    }

    zoologico.listarAnimais()
}