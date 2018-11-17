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
package com.joedanpar.improbabot.components.config;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Config",
       uniqueConstraints = @UniqueConstraint(columnNames = {"ServerId", "Key"}))
public class Config implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private int    id;
    @Column(name = "ServerId", nullable = false)
    private String serverId;
    @Column(name = "Key", nullable = false)
    private String key;
    @Column(name = "Value")
    private String value;

    public Config() {
        //no-op
    }

    Config(final String serverId, final String key, final String value) {
        this.serverId = serverId;
        this.key = key;
        this.value = value;
    }
}
