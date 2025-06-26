SELECT * FROM usuarios;


INSERT INTO usuarios (id, nome, email, senha) 
VALUES
(gen_random_uuid(), 'João Silva Souza', 'joao.silva@gmail.com', 'Senha@123'),
(gen_random_uuid(), 'Maria Oliveira Costa', 'maria.oliveira@yahoo.com.br', 'Senha@456'),
(gen_random_uuid(), 'Carlos Alberto Souza', 'carlos.souza@hotmail.com', 'Senha@789'),
(gen_random_uuid(), 'Ana Clara Costa', 'ana.costa@outlook.com', 'Senha@321'),
(gen_random_uuid(), 'Pedro Henrique Santos', 'pedro.santos@icloud.com', 'Senha@654');
