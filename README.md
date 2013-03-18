tomeejackson
============

Small app for demonstrating Jackon jsonprovider with TomEE+ 1.5.1.

The problem with the out-of-the-box JSON handling by TomEE 1.5.1 is that
lists with exactly one element do not have the [] pair surrounded. This is
imho not what a consumer application should expect. 

Seems the configuration of the JSON provider is tricky (well, I did not 
manage to get it running properly), somebody hinted to use Jackson.

This repo is the first trial. First trial, since I do not believe that
the provided jackson jar is used, since I still get bracket-less output
for a list with exactly one element.
