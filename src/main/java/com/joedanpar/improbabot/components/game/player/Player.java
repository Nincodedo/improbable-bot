/*******************************************************************************
 * This file is part of Improbable Bot.
 *
 *     Improbable Bot is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Improbable Bot is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Improbable Bot.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.joedanpar.improbabot.components.game.player;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Player",
       uniqueConstraints = @UniqueConstraint(columnNames = {"ServerId", "Name"}))
public class Player implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private int    id;
    @Column(name = "ServerId", nullable = false)
    private String serverId;
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Gender", nullable = false)
    private Gender gender;

    public Player() {
        //no-op
    }

    Player(final String serverId, final String name, final Gender gender) {
        this.serverId = serverId;
        this.name = name;
        this.gender = gender;
    }

}
