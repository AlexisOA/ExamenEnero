package test;

import es.ulpgc.CampoBatalla;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CampoBatalla_ {

    @Test
    public void should_return_all_battlecamp_if_not_explode_bomb_around(){
        assertThat(CampoBatalla.survivor("abde [fgh] ijk")).isEqualTo("abdefghijk");
        assertThat(CampoBatalla.survivor("abde [aaa] ijk")).isEqualTo("abdeaaaijk");
    }

    @Test
    public void should_refugees_saved_when_one_bomb_explode_around(){
        assertThat(CampoBatalla.survivor("ab # de [fgh] ijk")).isEqualTo("fgh");
        assertThat(CampoBatalla.survivor("ab # de [aaaa] ijk")).isEqualTo("aaaa");
    }

    @Test
    public void should_return_empty_if_two_bombs_explode_around(){
        assertThat(CampoBatalla.survivor("a ## bde [fgh] ijk")).isEqualTo("");
        assertThat(CampoBatalla.survivor("ab # de [fgh] ij # k")).isEqualTo("");
    }



    @Test
    public void should_saved_if_two_bombs_not_explode_around(){
        assertThat(CampoBatalla.survivor("a ## bde [fgh] ijk [mn] op")).isEqualTo("mn");
        assertThat(CampoBatalla.survivor("a # bde [fgh] i # jk [mn] op")).isEqualTo("mn");
    }

}
