package ui

import model.Tabuleiro
import model.TabuleiroEvento
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main() {
    UiMain()
}
class UiMain : JFrame() {
    private val tabuleiro = Tabuleiro(qtdeLinhas = 5, qtdeColunas = 5, qtdeMinas = 5)
    private val painelTabuleiro = PainelTabuleiro(tabuleiro)
    init {
        tabuleiro.onEvento(this::mostraResultado)
        add(painelTabuleiro)
        setSize(1000, 1000)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Campo Minado"
        isVisible = true
    }

    private fun mostraResultado(evento: TabuleiroEvento){
        SwingUtilities.invokeLater {
            val msg = when(evento){
                TabuleiroEvento.VITORIA -> "Você ganhou"
                TabuleiroEvento.DERROTA -> "Você perdeu... Ué"
            }
            JOptionPane.showMessageDialog(this, msg)
            tabuleiro.reiniciar()

            painelTabuleiro.repaint()
            painelTabuleiro.validate()
        }
    }
}