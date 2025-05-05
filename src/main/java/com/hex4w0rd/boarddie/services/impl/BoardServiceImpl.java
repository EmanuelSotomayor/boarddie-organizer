package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.dto.BoardDTO;
import com.hex4w0rd.boarddie.dto.ColumnDTO;
import com.hex4w0rd.boarddie.repositories.BoardRepository;
import com.hex4w0rd.boarddie.request.BoardUpdateRequest;
import com.hex4w0rd.boarddie.services.IBoardService;
import com.hex4w0rd.boarddie.services.IMessageService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements IBoardService {

    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;
    private final IMessageService messageService;

    @Override
    public BoardDTO saveBoard(BoardDTO boardDTO) {
        return null;
    }

    @Override
    public BoardDTO updateBoardById(UUID id, BoardUpdateRequest boardUpdateRequest) {
        return null;
    }

    @Override
    public Boolean deleteBoardById(UUID id) {
        return null;
    }

    @Override
    public BoardDTO getBoardById(UUID id) {
        return null;
    }

    @Override
    public Page<BoardDTO> getAllBoards() {
        return null;
    }

    @Override
    public Boolean updateBoardFavoriteStatus(Boolean check) {
        return null;
    }

    @Override
    public Boolean addColumnToBoard(UUID boardId, ColumnDTO columnDTO) {
        return null;
    }

    @Override
    public Boolean deleteColumnOfBoard(UUID boardId, UUID columnId) {
        return null;
    }

    @Override
    public Boolean updateColumnOfBoard(UUID boardId, UUID columnId, ColumnDTO columnDTO) {
        return null;
    }

}