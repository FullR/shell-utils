#!/bin/bash

if [ $# -eq 1 ]; then
  if [ $1 = "reset" ]; then
    echo "Clearing key"
    ssh-keygen-remove 192.168.7.2
    exit 0
  else
    user=$1
  fi
else
  user=root
fi

ssh $user@192.168.7.2
