# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "A general purpose language with dependent types"
HOMEPAGE = "https://www.idris-lang.org/"
# TODO change
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=4091e2fa52af81d8172e4156b50e7051"
SECTION = "base"
DEPENDS = "gcc"

inherit devshell

BBCLASSEXTEND = "native"

SRCREV = "0cbc3b839688ca2de83b6103a637ce4519dc4ea5"
SRC_URI = "git://github.com/edwinb/Idris2"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'CC=gcc' -j 1"

do_install () {
  oe_runmake install-fromc
}
