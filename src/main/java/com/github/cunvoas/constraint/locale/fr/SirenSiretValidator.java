/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.cunvoas.constraint.locale.fr;

import com.github.cunvoas.annotation.locale.fr.Siren;
import com.github.cunvoas.constraint.checkdigit.ModulusValidator;

/**
 * Modulus 10 <b>EAN-13</b> / <b>UPC</b> / <b>ISBN-13</b> Check Digit
 * calculation/validation.
 * <p>
 * Check digit calculation is based on <i>modulus 10</i> with digits in
 * an <i>odd</i> position (from right to left) being weighted 1 and <i>even</i>
 * position digits being weighted 3.
 * <p>
 * For further information see:
 * <ul>
 *   <li>http://fr.wikipedia.org/wiki/Syst%C3%A8me_d%27identification_du_r%C3%A9pertoire_des_entreprises</li>
 *   <li>http://fr.wikipedia.org/wiki/Syst%C3%A8me_d%27identification_du_r%C3%A9pertoire_des_%C3%A9tablissements</li>
 *   
 * </ul>
 *      317480135
 *   	31748013500035
 */
@Deprecated
public final class SirenSiretValidator extends ModulusValidator<Siren> {

    /** weighting given to digits depending on their right position */
    private static final int[] POSITION_WEIGHT = new int[] {2, 1};

    public SirenSiretValidator() {
        super(10, false);
    }

    /**
     * <p>Calculates the <i>weighted</i> value of a character in the
     * code at a specified position.</p>
     *
     * <p>For EAN-13 (from right to left) <b>odd</b> digits are weighted
     * with a factor of <b>one</b> and <b>even</b> digits with a factor
     * of <b>three</b>.</p>
     *
     * {@inheritDoc}
     * @see com.github.cunvoas.constraint.checkdigit.ModulusValidator#weightedValue(int, int, int)
     */
    @Override
    protected int weightedValue(int charValue, int leftPos, int rightPos )
            throws Exception {
        int weight = POSITION_WEIGHT[rightPos % 2];
        return (charValue * weight);
    }
}

