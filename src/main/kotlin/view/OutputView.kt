package view

import domain.Board
import domain.Cell
import domain.Row

object OutputView {

    fun printBoard(board: Board) {
        board.rows.forEach(::printRow)
    }

    private fun printRow(row: Row) {
        row.cells.forEach(::printCell)
        println()
    }

    private fun printCell(cell: Cell) {
        val value = when (cell.isOpen()) {
            true -> cell.getValue()
            else -> "C"
        }

        print("$value ")
    }

    fun printLose() {
        println("Lose Game.")
    }
}