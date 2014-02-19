require './pong_app'
require './middlewares/pong_backend'

use PongDemo::PongBackend

run PongDemo::PongApp
