/**
 * Copyright © 2016 Instituto Superior Técnico
 *
 * This file is part of Bennu Social.
 *
 * Bennu Social is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bennu Social is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Bennu Social.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.bennu.social.exception;

public class AccessTokenNotProvidedException extends Exception {

    private static final long serialVersionUID = -6434508424172449315L;

    public AccessTokenNotProvidedException(String answer) {
        super();
        this.answer = answer;
    }

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
