# -*- fill-column: 72 -*-
AUTOMAKE_OPTIONS =		subdir-objects
ACLOCAL_AMFLAGS =		-I build-aux/m4

opentxs_include_dir =		$(top_srcdir)/include
opentxs_source_dir =		$(top_srcdir)/src

common_includes =		-I$(opentxs_include_dir)			\
				-I$(opentxs_include_dir)/otlib			\
				$(DEPS_CFLAGS)


## COMMON FLAGS ###

AM_CPPFLAGS = 			$(common_includes)				\
				-g3						\
				-ggdb						\
				-rdynamic					\
				-O0						\
				--param ssp-buffer-size=4

AM_LDFLAGS = 			$(DEPS_LDFLAGS)

## WARNING FLAGS ###

if WARNINGS
AM_CPPFLAGS +=			-Waddress					\
				-Woverloaded-virtual				\
				-Wshadow					\
				-Wconversion
endif

## RELEASE FLAGS ###

if RELEASE
AM_CPPFLAGS +=			-Wall						\
				-D_FORTIFY_SOURCE=2				\
				-fstack-protector-all				\
				-fstack-check					\
				-Wstack-protector
endif

####################################################################


####	BigInt

bigint_headers_dir =		$(opentxs_include_dir)/bigint

bigint_headers =		include/bigint/BigInteger.h			\
				include/bigint/BigIntegerAlgorithms.h		\
				include/bigint/BigIntegerLibrary.h		\
				include/bigint/BigIntegerUtils.h		\
				include/bigint/BigUnsigned.h			\
				include/bigint/BigUnsignedInABase.h		\
				include/bigint/NumberlikeArray.h

bigint_sources_dir =		$(opentxs_source_dir)/bigint

bigint_sources =		src/bigint/BigInteger.cc			\
				src/bigint/BigIntegerAlgorithms.cc		\
				src/bigint/BigIntegerUtils.cc			\
				src/bigint/BigUnsigned.cc			\
				src/bigint/BigUnsignedInABase.cc

####	Simple Ini

simpleini_headers_dir	=	$(opentxs_include_dir)/simpleini

simpleini_headers	=	include/simpleini/ConvertUTF.h			\
				include/simpleini/SimpleIni.h

simpleini_sources_dir	= 	$(opentxs_source_dir)/simpleini

simpleini_sources	=	src/simpleini/ConvertUTF.cpp			\
				src/simpleini/snippets.cpp

####	Containers

containers_headers_dir	=	$(opentxs_include_dir)/containers

containers_headers 	=	include/containers/containers.hpp		\
				include/containers/containers_fixes.hpp		\
				include/containers/copy_functors.hpp		\
				include/containers/digraph.hpp			\
				include/containers/digraph.tpp			\
				include/containers/exceptions.hpp		\
				include/containers/foursome.hpp			\
				include/containers/foursome.tpp			\
				include/containers/hash.hpp			\
				include/containers/hash.tpp			\
				include/containers/matrix.hpp			\
				include/containers/matrix.tpp			\
				include/containers/ntree.hpp			\
				include/containers/ntree.tpp			\
				include/containers/safe_iterator.hpp		\
				include/containers/safe_iterator.tpp		\
				include/containers/simple_ptr.hpp		\
				include/containers/simple_ptr.tpp		\
				include/containers/smart_ptr.hpp		\
				include/containers/smart_ptr.tpp		\
				include/containers/triple.hpp			\
				include/containers/triple.tpp


####	IrrXML

irrxml_headers_dir =		$(opentxs_include_dir)/irrxml

irrxml_headers =		include/irrxml/CXMLReaderImpl.h			\
				include/irrxml/fast_atof.h			\
				include/irrxml/heapsort.h			\
				include/irrxml/irrArray.h			\
				include/irrxml/irrString.h			\
				include/irrxml/irrTypes.h			\
				include/irrxml/irrXML.h

irrxml_sources_dir = 		$(opentxs_source_dir)/irrxml

irrxml_sources =		src/irrxml/irrXML.cpp


####	Lucre

lucre_headers_dir =		$(opentxs_include_dir)/lucre

lucre_headers =			include/lucre/bank.h

lucre_sources_dir = 		$(opentxs_source_dir)/lucre

lucre_sources =			src/lucre/bankdemo.cpp				\
				src/lucre/bankimp.cpp				\
				src/lucre/bank-new.cpp				\
				src/lucre/bank-sign.cpp				\
				src/lucre/bank-verify.cpp			\
				src/lucre/coin-request.cpp			\
				src/lucre/coin-unblind.cpp

####	OT

ot_sources_dir = 		$(opentxs_source_dir)/ot

ot_sources =			src/ot/main.cpp


####	OT API

otapi_headers_dir =		$(opentxs_include_dir)/otapi

otapi_headers =			include/otapi/main.h				\
				include/otapi/OpenTransactions.h		\
				include/otapi/OTAPI.h				\
				include/otapi/OTAPI_funcdef.h			\
				include/otapi/OTAPI_Wrapper.h			\
				include/otapi/OTClient.h			\
				include/otapi/OTServerConnection.h

otapi_sources_dir = 		$(opentxs_source_dir)/otapi

otapi_sources =			src/otapi/OpenTransactions.cpp			\
				src/otapi/OTAPI.cpp				\
				src/otapi/OTAPI_Wrapper.cpp			\
				src/otapi/OTClient.cpp				\
				src/otapi/OTServerConnection.cpp

####	OT LIB

otlib_headers_dir =		$(opentxs_include_dir)/otlib

otlib_headers =			include/otlib/anyoption.h			\
				include/otlib/Bitcoin.pb.h			\
				include/otlib/easyzlib.h			\
				include/otlib/fast_mutex.h			\
				include/otlib/Generics.pb.h			\
				include/otlib/Markets.pb.h			\
				include/otlib/Moneychanger.pb.h			\
				include/otlib/OTAccount.h			\
				include/otlib/OTAgreement.h			\
				include/otlib/OTASCIIArmor.h			\
				include/otlib/OTAssetContract.h			\
				include/otlib/OTAsymmetricKey.h			\
				include/otlib/OTBasket.h			\
				include/otlib/OTBylaw.h				\
				include/otlib/OTCheque.h			\
				include/otlib/OTContract.h			\
				include/otlib/OTCron.h				\
				include/otlib/OTCronItem.h			\
				include/otlib/OTData.h				\
				include/otlib/OTDataCheck.h			\
				include/otlib/ot_default_paths.h		\
				include/otlib/OTEnvelope.h			\
				include/otlib/OTglobal.h			\
				include/otlib/OTIdentifier.h			\
				include/otlib/OTInstrument.h			\
				include/otlib/OTItem.h				\
				include/otlib/OTLedger.h			\
				include/otlib/OTLib.h				\
				include/otlib/OTLibPriv.h			\
				include/otlib/OTLog.h				\
				include/otlib/OTMarket.h			\
				include/otlib/OTMessage.h			\
				include/otlib/OTMessageBuffer.h			\
				include/otlib/OTMint.h				\
				include/otlib/OTOffer.h				\
				include/otlib/OTPassword.h			\
				include/otlib/OTPayload.h			\
				include/otlib/OTPayment.h			\
				include/otlib/OTPaymentPlan.h			\
				include/otlib/OTPseudonym.h			\
				include/otlib/OTPurse.h				\
				include/otlib/OTScript.h			\
				include/otlib/OTScriptable.h			\
				include/otlib/OTServerContract.h		\
				include/otlib/OTSignature.h			\
				include/otlib/OTSignedFile.h			\
				include/otlib/OTSmartContract.h			\
				include/otlib/OTStorage.h			\
				include/otlib/OTString.h			\
				include/otlib/OTStringXML.h			\
				include/otlib/OTToken.h				\
				include/otlib/OTTrackable.h			\
				include/otlib/OTTrade.h				\
				include/otlib/OTTransaction.h			\
				include/otlib/OTTransactionType.h		\
				include/otlib/OTWallet.h			\
				include/otlib/stacktrace.h			\
				include/otlib/Timer.h				\
				include/otlib/tinythread.h			\
				include/otlib/WinsockWrapper.h

otlib_sources_dir = 		$(opentxs_source_dir)/otlib

otlib_sources     =		src/otlib/anyoption.cpp				\
				src/otlib/Bitcoin.pb.cpp			\
				src/otlib/easyzlib.c				\
				src/otlib/Generics.pb.cpp			\
				src/otlib/Markets.pb.cpp			\
				src/otlib/mkcert.c				\
				src/otlib/Moneychanger.pb.cpp			\
				src/otlib/OTAccount.cpp				\
				src/otlib/OTAgreement.cpp			\
				src/otlib/OTASCIIArmor.cpp			\
				src/otlib/OTAssetContract.cpp			\
				src/otlib/OTAsymmetricKey.cpp			\
				src/otlib/OTBasket.cpp				\
				src/otlib/OTBylaw.cpp				\
				src/otlib/OTCheque.cpp				\
				src/otlib/OTContract.cpp			\
				src/otlib/OTCron.cpp				\
				src/otlib/OTCronItem.cpp			\
				src/otlib/OTData.cpp				\
				src/otlib/OTDataCheck.cpp			\
				src/otlib/OTEnvelope.cpp			\
				src/otlib/OTIdentifier.cpp			\
				src/otlib/OTInstrument.cpp			\
				src/otlib/OTItem.cpp				\
				src/otlib/OTLedger.cpp				\
				src/otlib/OTLog.cpp				\
				src/otlib/OTMarket.cpp				\
				src/otlib/OTMessage.cpp				\
				src/otlib/OTMessageBuffer.cpp			\
				src/otlib/OTMint.cpp				\
				src/otlib/OTOffer.cpp				\
				src/otlib/OTPassword.cpp			\
				src/otlib/OTPayload.cpp				\
				src/otlib/OTPayment.cpp				\
				src/otlib/OTPaymentPlan.cpp			\
				src/otlib/OTPseudonym.cpp			\
				src/otlib/OTPurse.cpp				\
				src/otlib/OTScript.cpp				\
				src/otlib/OTScriptable.cpp			\
				src/otlib/OTServerContract.cpp			\
				src/otlib/OTSignature.cpp			\
				src/otlib/OTSignedFile.cpp			\
				src/otlib/OTSmartContract.cpp			\
				src/otlib/OTStorage.cpp				\
				src/otlib/OTString.cpp				\
				src/otlib/OTStringXML.cpp			\
				src/otlib/OTToken.cpp				\
				src/otlib/OTTrackable.cpp			\
				src/otlib/OTTrade.cpp				\
				src/otlib/OTTransaction.cpp			\
				src/otlib/OTTransactionType.cpp			\
				src/otlib/OTWallet.cpp				\
				src/otlib/Timer.cpp				\
				src/otlib/tinythread.cpp

####	OT Server

otserver_headers_dir	=	$(opentxs_include_dir)/otserver

otserver_headers	= 	include/otserver/main.h				\
				include/otserver/OTClientConnection.h		\
				include/otserver/OTServer.h

otserver_sources_dir	=	$(opentxs_source_dir)/otserver

otserver_sources	=	src/otserver/OTClientConnection.cpp		\
				src/otserver/OTServer.cpp

####	OT Create Mint

createmint_sources_dir	=	$(opentxs_source_dir)/createmint

####################################################################


##########################
## Open Transactions Lib #
##########################

lib_LTLIBRARIES		=	libot.la					\
				libotapi.la					\
				libbigint.la					\
				libirrxml.la					\
				liblucre.la

####	LIB BigInt

libbigint_la_SOURCES	=	$(bigint_sources) $(bigint_headers)
libbigint_la_CPPFLAGS	=	-I$(bigint_headers_dir) $(DEPS_CFLAGS) -fpic
libbigint_la_LDFLAGS	=	-static

####	LIB IrrXML

libirrxml_la_SOURCES	=	$(irrxml_sources) $(irrxml_headers)
libirrxml_la_CPPFLAGS	=	-I$(irrxml_headers_dir) $(DEPS_CFLAGS) -fpic
libirrxml_la_LDFLAGS	=	-static

####	LIB Lucre

liblucre_la_SOURCES	=	$(lucre_sources) $(lucre_headers)
liblucre_la_CPPFLAGS	=	-I$(lucre_headers_dir) $(DEPS_CFLAGS) -fpic
liblucre_la_LDFLAGS	=	-static


####	LIB OT

libot_la_SOURCES	=	$(otlib_sources) $(otlib_headers)	\
				$(containers_headers)

libot_la_CPPFLAGS	=	$(AM_CPPFLAGS)

libot_la_LIBADD		=	$(DEPS_LIBS)				\
				$(BOOST_LDFLAGS)			\
				$(BOOST_THREAD_LIB)			\
				libbigint.la libirrxml.la liblucre.la

libot_la_DEPENDENCIES	=	libbigint.la libirrxml.la liblucre.la

libot_la_LDFLAGS	=	--no-undefined


####	 LIB OT API

libotapi_la_SOURCES	=	$(otapi_sources) $(otapi_headers)	\
				$(simpleini_headers)

libotapi_la_CPPFLAGS	=	-I$(otapi_headers_dir) $(AM_CPPFLAGS) -fpic

libotapi_la_LIBADD	=	libot.la
libotapi_la_DEPENDENCIES=	libot.la

libotapi_la_LDFLAGS	=	-static


####	Global Headers

pkginclude_HEADERS	=	$(otlib_headers)


##########################
## Open Transactions Bin #
##########################

bin_PROGRAMS		=	ot					\
				otserver				\
				createmint

####	OT

ot_SOURCES		=	$(ot_sources) $(otapi_headers)
ot_CPPFLAGS		=	-I$(otapi_headers_dir) $(AM_CPPFLAGS) -fpic
ot_LDADD		=	libotapi.la libot.la
ot_DEPENDENCIES		=	libotapi.la libot.la


####	OT Server

otserver_SOURCES	=	$(otserver_sources) $(otserver_headers)
otserver_CPPFLAGS	=	-I$(otserver_headers_dir) $(AM_CPPFLAGS)
otserver_LDADD		=	libot.la
otserver_DEPENDENCIES	=	libot.la


####	Createmint  (includes files from OT Server)

createmint_SOURCES	=	$(otserver_sources)			\
				$(otserver_headers)

createmint_CPPFLAGS	=	-I$(otserver_headers_dir) $(AM_CPPFLAGS)
createmint_LDADD	=	libot.la
createmint_DEPENDENCIES =	libot.la


####################################
## Open Transactions Build Options #
####################################


####	ZMQ

if TRANSPORT_ZMQ

libotapi_la_CPPFLAGS		+=	-DOT_ZMQ_MODE
ot_CPPFLAGS			+=	-DOT_ZMQ_MODE

otserver_SOURCES		+=	src/otserver/xmlrpcxx_server.cpp
otserver_CPPFLAGS		+=	-DOT_ZMQ_MODE

createmint_SOURCES		+=	src/createmint/main.cpp
createmint_CPPFLAGS		+=	-DOT_ZMQ_MODE

endif


if WANT_JAVA
lib_LTLIBRARIES			+=	libotapi-java.la
endif

libotapi_java_la_SOURCES	=	swig/otapi/OTAPI-java.cxx		\
					swig/otapi/OTAPI-java.h

libotapi_java_la_CPPFLAGS	=	$(AM_CPPFLAGS)				\
					$(JNI_CPPFLAGS)				\
					-I$(otapi_headers_dir)

libotapi_java_la_LIBADD 	=	libotapi.la libot.la
libotapi_java_la_DEPENDENCIES 	=	libotapi.la libot.la

libotapi_java_la_LDFLAGS 	=	--no-undefined

if TRANSPORT_ZMQ
libotapi_java_la_CPPFLAGS 	+=	-DOT_ZMQ_MODE
endif


#### OT API PERL5

if WANT_PERL5
lib_LTLIBRARIES 		+=	libotapi-perl5.la
endif

libotapi_perl5_la_SOURCES	=	swig/otapi/OTAPI-perl5.cxx
libotapi_perl5_la_CPPFLAGS	=	$(AM_CPPFLAGS)			\
					$(PERL_EXT_CPPFLAGS)		\
					-I$(otapi_headers_dir)		\
					-I$(PERL_EXT_INC)

libotapi_perl5_la_LIBADD	=	libotapi.la libot.la
libotapi_perl5_la_DEPENDENCIES	=	libotapi.la libot.la

libotapi_perl5_la_LDFLAGS	=	--no-undefined			\
					$(PERL_EXT_LDFLAGS)
if TRANSPORT_ZMQ
libotapi_perl5_la_CPPFLAGS	+=	-DOT_ZMQ_MODE
endif


#### OT API PHP

if WANT_PHP
lib_LTLIBRARIES			+=	libotapi-php.la
endif

libotapi_php_la_SOURCES		=	swig/otapi/OTAPI-php.cpp	\
					swig/otapi/OTAPI-php.h

libotapi_php_la_CPPFLAGS	=	$(AM_CPPFLAGS)			\
					-I$(otapi_headers_dir)		\
					-I$(top_srcdir)/swig/glue/php	\
					$(PHP_INCLUDES)

libotapi_php_la_LIBADD		=	libotapi.la libot.la
libotapi_php_la_DEPENDENCIES	=	libotapi.la libot.la

libotapi_php_la_LDFLAGS		=	--no-undefined			\
					$(PHP_LDFLAGS)

if TRANSPORT_ZMQ
libotapi_php_la_CPPFLAGS	+=	-DOT_ZMQ_MODE
endif


#### OT API PYTHON

if WANT_PYTHON
lib_LTLIBRARIES			+=	_otapi.la
endif

_otapi_la_SOURCES		=	swig/otapi/OTAPI-python.cxx	\
					swig/otapi/OTAPI-python.h

_otapi_la_CPPFLAGS		= 	$(AM_CPPFLAGS)  -fpic           \
					$(PYTHON_CPPFLAGS)              \
					-I$(otapi_headers_dir)          \
					$(PYTHON_EXTRA_LIBS)


_otapi_la_LIBADD		=	libotapi.la libot.la
_otapi_la_DEPENDENCIES		= 	libotapi.la libot.la

_otapi_la_LDFLAGS		=	--no-undefined                  \
					-module -avoid-version          \
					$(PYTHON_LDFLAGS)               \
					$(PYTHON_EXTRA_LDFLAGS)

if TRANSPORT_ZMQ
_otapi_la_CPPFLAGS		+=	-DOT_ZMQ_MODE
endif



###########################################################################

#######################################
## Open-Transactions Install Extras  ##
#######################################


#### OpenTXS script CLI utility

dist_bin_SCRIPTS		=	scripts/opentxs

#### OT script HEADERS

opentxslibdir			=	$(pkglibdir)

dist_opentxslib_SCRIPTS		=	scripts/ot/ot_commands.ot	\
					scripts/ot/otapi.ot		\
					scripts/ot/ot_made_easy.ot	\
					scripts/ot/ot_utility.ot

#### OT docs, licences, info, etc.

opentxsdocdir			=	$(docdir)

dist_opentxsdoc_DATA		=	docs/GETTING-STARTED.txt	\
					docs/INSTALL-Android.txt	\
					docs/INSTALL-Fedora.txt		\
					docs/INSTALL-Debian_Ubuntu.txt	\
					docs/INSTALL-OSX-Homebrew.txt	\
					docs/INSTALL-Windows.txt	\
					docs/SSL-NOTES.txt		\
					docs/WIPE-USERS-ACCOUNTS.txt	\
					docs/LICENSE-AND-CREDITS.txt	\
					PUBKEY-FellowTraveler.asc	\
					README.md 			\
					VERSION

nobase_dist_opentxsdoc_DATA	=	sample-data/ot-sample-data-clean/ot_init.cfg				\
					sample-data/ot-sample-data-clean/client.cfg				\
					sample-data/ot-sample-data-clean/CLIENT-COMMANDS.txt			\
					sample-data/ot-sample-data-clean/command-line-ot.opt			\
					sample-data/ot-sample-data-clean/client_data/LICENSE-AND-CREDITS.txt	\
					sample-data/ot-sample-data-clean/server.cfg				\
					sample-data/ot-sample-data-clean/server_data/notaryServer.xml
