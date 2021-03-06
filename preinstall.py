import urllib
from shutil import copyfile
import os

LIB_CORE_VERSION = "1.1.0"
BASE_URL = "https://s3-eu-west-1.amazonaws.com/ledger-lib-ledger-core"

def download_file(directory, file_name, output_dir):
    """Download file on bucket"""
    endpoint_url = BASE_URL + "/" + directory
    final_file = "lib/" + output_dir + "/" + file_name
    if not os.path.exists("lib/" + output_dir):
        os.makedirs("lib/" + output_dir)
    print('Downloading ' + endpoint_url + "/" + file_name + ' ...')
    opener = urllib.URLopener()
    opener.retrieve(endpoint_url + "/" + file_name, final_file)
    os.chmod(final_file, 0o755)

download_file(LIB_CORE_VERSION + "/ios", "libledger-core.dylib", "ios/x86")
download_file(LIB_CORE_VERSION + "/android", "libledger-core.so", "android/x86")

if not os.path.exists("android/libs/x86"):
    os.makedirs("android/libs/x86")

copyfile("lib/android/x86/libledger-core.so", "android/libs/x86/libledger-core.so")

if not os.path.exists("ios/Libraries/x86"):
    os.makedirs("ios/Libraries/x86")

copyfile("lib/ios/x86/libledger-core.dylib", "ios/Libraries/x86/libledger-core.dylib")
