DESCRIPTION = "Analog Devices Libiio"
LICENSE = "LGPLv2.1"

LIC_FILES_CHKSUM = "file://COPYING.txt;md5=7c13b3376cea0ce68d2d2da0a1b3a72c"

SRCREV = "6ecff5d46e1b12c2859f0b63a73282940e3402bb"
SRCBRANCH = "master"

PVBASE := "${PV}"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PVBASE}:"

PV = "${PVBASE}.${SRCPV}"

SRC_URI = "git://github.com/analogdevicesinc/libiio.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

inherit autotools cmake

DEPENDS += "libxml2 bison flex ncurses avahi"

PARALLEL_MAKE = ""
