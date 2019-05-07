// Copyright © 2017-2019 Trust Wallet.
//
// This file is part of Trust. The full Trust copyright notice, including
// terms governing use, modification, and redistribution, is contained in the
// file LICENSE at the root of the source code distribution tree.

#include "TWTestUtilities.h"

#include <TrustWalletCore/TWSegwitAddress.h>
#include <TrustWalletCore/TWBitcoinAddress.h>
#include <TrustWalletCore/TWBitcoinScript.h>
#include <TrustWalletCore/TWHash.h>
#include <TrustWalletCore/TWHDWallet.h>
#include <TrustWalletCore/TWHRP.h>
#include <TrustWalletCore/TWP2PKHPrefix.h>
#include <TrustWalletCore/TWPrivateKey.h>

#include <gtest/gtest.h>

TEST(Qtum, LegacyAddress) {
    auto privateKey = WRAP(TWPrivateKey, TWPrivateKeyCreateWithData(DATA("a22ddec5c567b4488bb00f69b6146c50da2ee883e2c096db098726394d585730").get()));
    auto publicKey = TWPrivateKeyGetPublicKeySecp256k1(privateKey.get(), true);
    auto address = TWBitcoinAddressCreateWithPublicKey(publicKey, TWP2PKHPrefixQtum);
    auto addressString = WRAPS(TWBitcoinAddressDescription(address));
    assertStringsEqual(addressString, "QWVNLCXwhJqzut9YCLxbeMTximr2hmw7Vr");
}

TEST(Qtum, Address) {
    auto privateKey = WRAP(TWPrivateKey, TWPrivateKeyCreateWithData(DATA("55f9cbb0376c422946fa28397c1219933ac60b312ede41bfacaf701ecd546625").get()));
    auto publicKey = TWPrivateKeyGetPublicKeySecp256k1(privateKey.get(), true);
    auto address = WRAP(TWSegwitAddress, TWSegwitAddressCreateWithPublicKey(TWHRPQtum, publicKey));
    auto string = WRAPS(TWSegwitAddressDescription(address.get()));

    assertStringsEqual(string, "qc1qytnqzjknvv03jwfgrsmzt0ycmwqgl0as6uywkk");
}

TEST(Qtum, BuildForAddressM) {
    auto script = WRAP(TWBitcoinScript, TWBitcoinScriptBuildForAddress(STRING("MHhghmmCTASDnuwpgsPUNJVPTFaj61GzaG").get()));
    auto scriptData = WRAPD(TWBitcoinScriptData(script.get()));
    assertHexEqual(scriptData, "a9146b85b3dac9340f36b9d32bbacf2ffcb0851ef17987");
}

TEST(Qtum, ExtendedKeys) {
    auto wallet = WRAP(TWHDWallet, TWHDWalletCreateWithMnemonic(
        STRING("ripple scissors kick mammal hire column oak again sun offer wealth tomorrow wagon turn fatal").get(),
        STRING("TREZOR").get()
    ));

    // .bip44
    auto xprv = WRAPS(TWHDWalletGetExtendedPrivateKey(wallet.get(), TWPurposeBIP44, TWCoinTypeQtum, TWHDVersionXPRV));
    auto xpub = WRAPS(TWHDWalletGetExtendedPublicKey(wallet.get(), TWPurposeBIP44, TWCoinTypeQtum, TWHDVersionXPUB));

    assertStringsEqual(xprv, "xprv9yBPu3rkmyffD3A4TngwcpffYASEEfYnShyhuUsL3h9GiYdUjJh9S2s3vcYMoKi8L2cDqQcsFU5TkC1zgusTENCjatpnxp72X4uYkrej2tj");
    assertStringsEqual(xpub, "xpub6CAkJZPecMDxRXEXZpDwyxcQ6CGie8GdovuJhsGwc2gFbLxdGr1PyqBXmsL7aYds1wfY2rB3YMVZiEE3CB3Lkj6KGoq1rEJ1wuaGkMDBf1m");

    // .bip49
    auto yprv = WRAPS(TWHDWalletGetExtendedPrivateKey(wallet.get(), TWPurposeBIP49, TWCoinTypeQtum, TWHDVersionYPRV));
    auto ypub = WRAPS(TWHDWalletGetExtendedPublicKey(wallet.get(), TWPurposeBIP49, TWCoinTypeQtum, TWHDVersionYPUB));

    assertStringsEqual(yprv, "yprvAJdTrS1VXxDTRFGxPLJmjSECVCwqePCeCH7i6pLP3SiDg6G5omNiwEt88ENDy9nWMPmErGT5c1nGBsZRUjaTunFqw1w6xhWsAsLG6x8fR7d");
    assertStringsEqual(ypub, "ypub6XcpFwYPNKmkdjMRVMqn6aAw3EnL3qvVZW3JuCjzbnFCYtbEMJgyV3CbyY8jVCtSBfSB5H12uLcFYUSEtsBYNaf46Zv2smueAZKGmDgT8k8");

    // .bip84
    auto zprv = WRAPS(TWHDWalletGetExtendedPrivateKey(wallet.get(), TWPurposeBIP84, TWCoinTypeQtum, TWHDVersionZPRV));
    auto zpub = WRAPS(TWHDWalletGetExtendedPublicKey(wallet.get(), TWPurposeBIP84, TWCoinTypeQtum, TWHDVersionZPUB));
    assertStringsEqual(zprv, "zprvAdJxRo2izCdp1NZQShHqyXXwNrkAbYqi9YwAkG6kCJ2V5JZY7s2TdmbF2YxTzQKVx3SWQiHpVpsKyZ59Y8Th7edf2hJBWuyTvnCadLMLxAz");
    assertStringsEqual(zpub, "zpub6rJJqJZcpaC7DrdsYiprLfUfvtaf11ZZWmrmYeWMkdZTx6tgfQLiBZuisraogskwBRLMGWfXoCyWRrXSypwPdNV2UWJXm5bDVQvBXvrzz9d");
}

TEST(Qtum, DeriveFromXpub) {
    auto xpub = STRING("xpub6CAkJZPecMDxRXEXZpDwyxcQ6CGie8GdovuJhsGwc2gFbLxdGr1PyqBXmsL7aYds1wfY2rB3YMVZiEE3CB3Lkj6KGoq1rEJ1wuaGkMDBf1m");
    auto pubKey2 = TWHDWalletGetPublicKeyFromExtended(xpub.get(), STRING("m/44'/2301'/0'/0/2").get());
    auto pubKey9 = TWHDWalletGetPublicKeyFromExtended(xpub.get(), STRING("m/44'/2301'/0'/0/9").get());

    auto address2 = TWBitcoinAddressCreateWithPublicKey(pubKey2, TWP2PKHPrefixQtum);
    auto address2String = WRAPS(TWBitcoinAddressDescription(address2));

    auto address9 = TWBitcoinAddressCreateWithPublicKey(pubKey9, TWP2PKHPrefixQtum);
    auto address9String = WRAPS(TWBitcoinAddressDescription(address9));

    assertStringsEqual(address2String, "QStYeAAfiYKxsABzY9yugHDpm5bsynYPqc");
    assertStringsEqual(address9String, "QfbKFChfhx1s4VXS9BzaVJgyKw5a1hnFg4");
}

TEST(Qtum, DeriveFromZpub) {
    auto zpub = STRING("zpub6rJJqJZcpaC7DrdsYiprLfUfvtaf11ZZWmrmYeWMkdZTx6tgfQLiBZuisraogskwBRLMGWfXoCyWRrXSypwPdNV2UWJXm5bDVQvBXvrzz9d");
    auto pubKey4 = TWHDWalletGetPublicKeyFromExtended(zpub.get(), STRING("m/44'/2301'/0'/0/4").get());
    auto pubKey11 = TWHDWalletGetPublicKeyFromExtended(zpub.get(), STRING("m/44'/2301'/0'/0/11").get());

    auto address4 = WRAP(TWSegwitAddress, TWSegwitAddressCreateWithPublicKey(TWHRPQtum, pubKey4));
    auto address4String = WRAPS(TWSegwitAddressDescription(address4.get()));

    auto address11 = WRAP(TWSegwitAddress, TWSegwitAddressCreateWithPublicKey(TWHRPQtum, pubKey11));
    auto address11String = WRAPS(TWSegwitAddressDescription(address11.get()));

    assertStringsEqual(address4String, "qc1q3cvjmc2cgjkz9y58waj3r9ccchmrmrdzq03783");
    assertStringsEqual(address11String, "qc1qrlk0ajg6khu2unsdppggs3pgpxxvdeymky58af");
}

/*
HD scheme that is used in qtum desktop wallet is "<MASTER KEY>/<COIN>/<INTERNAL>":
m/88'/0'
m/88'/1'
The trust wallet use different approach "<MASTER KEY>/<PURPOSE>/<COIN>":
m/44'/2301'
m/49'/2301'
m/84'/2301'
The master key is used to derive the other keys, so the wallet should work but will not be compatible with qtum desktop wallet.
The rules for creating send/receive Qtum transactions are the same as Bitcoin.
The default addresses in Qtum are the legacy addresses.
*/
