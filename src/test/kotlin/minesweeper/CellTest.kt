package minesweeper

import minesweeper.domain.Cell
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CellTest {
    @Test
    fun `보드의 셀은 기본적으로 비어있다`() {
        val cell = Cell.of(1, 2)
        assertThat(cell.hasMine()).isFalse()
    }

    @Test
    fun `보드의 셀에는 지뢰를 심을 수 있다`() {
        val cell = Cell.of(1, 2)
        cell.plantMine()
        assertThat(cell.hasMine()).isTrue()
    }
}