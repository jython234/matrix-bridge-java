/*
 * Copyright © 2018, jython234
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
module matrixjava.bridge {
    requires java.base;
    requires jdk.incubator.httpclient;

    requires matrixjava.appservice;

    requires slf4j.api;
    requires snakeyaml;

    requires leveldbjni.all;

    requires json.simple;
    requires gson;

    requires commons.io;

    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.web;
    requires spring.webmvc;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports io.github.jython234.matrix.bridge;
    exports io.github.jython234.matrix.bridge.configuration;
    exports io.github.jython234.matrix.bridge.db;
    exports io.github.jython234.matrix.bridge.network;
    exports io.github.jython234.matrix.bridge.network.registration;
    exports io.github.jython234.matrix.bridge.network.profile;
    exports io.github.jython234.matrix.bridge.network.room;
    exports io.github.jython234.matrix.bridge.network.directory;
    exports io.github.jython234.matrix.bridge.network.error;
    exports io.github.jython234.matrix.bridge.network.media;
    exports io.github.jython234.matrix.bridge.network.typing;
    exports io.github.jython234.matrix.bridge.network.presence;
}